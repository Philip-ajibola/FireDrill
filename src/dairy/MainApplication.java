package dairy;


import javax.swing.*;
import java.util.InputMismatchException;

public class MainApplication {
    public static void main(String[] args) {
        mainMenu();
    }
    private static Dairy createDairy(){
        String userName = input("Welcome To My Dairy \nWe Help You Keep track Of Your Daily Activities And Lot More \nEnter Your Name ");
        if(!userName.matches("[a-zA-Z]+")){
            if(userName.isEmpty())print("Your Name Should not be empty");
            print("Your name should consist of alphabetical number alone ");
            createDairy();
        }
        String userPassword = input("Create Password");
        if(userPassword.trim().isEmpty()){
            print("Your Password shouldn't contain space bar alone ");
            createDairy();
        }
        return new Dairy(userName,userPassword);
    }
    private static void mainMenu(){

        Dairy dairy = createDairy();
        displayOption(dairy);
    }

    private static void lockDairy(Dairy dairy){
        dairy.lockDairy();
        print("Dairy Locked");
        displayOption(dairy);
    }
    private static void addEntry(Dairy dairy){
        checkIfDairyIsLocked(dairy);
        String entryTitle = input("Enter title of your entry ");
        String entryBody = input("Enter Your Messages");
        dairy.createEntry(entryTitle,entryBody);
        print("Entry Successfully Added");
        print("Your Entry Id is " +dairy.getIdNumber(entryTitle) + "\nDo Not Forget Your Entry Id Else you Won't have to the Entry anyMore ");
        displayOption(dairy);
    }
    private static void findEntryById(Dairy dairy){
        try {
            checkIfDairyIsLocked(dairy);
            int entryId = Integer.parseInt(input("what's The Entry Id"));
            print(" " + dairy.findEntry(entryId));
        }catch(Exception e){
            print(" " + e.getMessage());
        }finally {
            displayOption(dairy);
        }
    }

    private static void print(String displayMessage) {
        JOptionPane.showMessageDialog(null,displayMessage);
    }
    private static void updateEntry(Dairy dairy){
        try{
            checkIfDairyIsLocked(dairy);
            int entryId = Integer.parseInt(input("Enter Entry Id"));
            String updatedTitle = ("Enter Title");
            String updatedBody = ("Enter Body");
            dairy.updateEntry(entryId,updatedTitle,updatedBody);
        }catch (Exception e){
            print(" " + e.getMessage());
        }finally {
            displayOption(dairy);
        }
    }
    private static void deleteEntry(Dairy dairy){
        try{
            checkIfDairyIsLocked(dairy);
            int entryId = Integer.parseInt(input("Enter Entry Id"));
            dairy.deleteEntry(entryId);
        }catch(Exception e){
            print(" "+e.getMessage());
        }finally {
            displayOption(dairy);
        }
    }
    private boolean isDairyLock(Dairy dairy){
        return dairy.isLocked();
    }
    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null,prompt);
    }
    private static void displayOption(Dairy dairy){
      // checkIfDairyIsLocked(dairy);
        try {
            String userResponse = input("""
                    <<<<<<< What would you love to do today >>>>>
                        [(1)] Add Entry         [(2)] Update Entry
                        
                        [(3)] Find Entry        [(4)] Delete Entry
                        
                        [(5)] Lock Entry        [(6)] Exit App
                    """);
            validateUserResponse(userResponse);
            displayTheResponseOfUser(dairy,Integer.parseInt(userResponse));
        }catch(Exception e){
            print(" " + e.getMessage());
            displayOption(dairy);
        }
    }
    private static void displayTheResponseOfUser(Dairy dairy,int userResponse){
        switch (userResponse){
            case 1-> addEntry(dairy);
            case 2-> updateEntry(dairy);
            case 3-> findEntryById(dairy);
            case 4-> deleteEntry(dairy);
            case 5-> lockDairy(dairy);
            case 6-> print("Good Bye");
            default -> {print("Invalid Response");displayOption(dairy);}
        }
    }
    private static void checkIfDairyIsLocked(Dairy dairy){
        if(dairy.isLocked()) {
            try {
                unlockDairy(dairy);
            }catch(Exception e){
                print(" " + e.getMessage());
                unlockDairy(dairy);
            }
        }
    }
    private static void unlockDairy(Dairy dairy){
        String password = input("Enter your password to unlock Dairy");
        dairy.isPinNotValid(password);
        dairy.unlockDairy(password);
        print("Dairy Unlocked Successfully ");
    }
    private static void validateUserResponse(String userResponse){
        if(!userResponse.matches("[0-9]+"))throw new InputMismatchException("Invalid input");
    }
}
