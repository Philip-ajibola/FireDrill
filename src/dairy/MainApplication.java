package dairy;


import javax.swing.*;

public class MainApplication {
    public static void main(String[] args) {

    }
    private static Dairy createDairy(){
        String userName = input("Enter Your Name ");
        String userPassword = input("Create Password");
        return new Dairy(userName,userPassword);
    }



    private static String input(String input) {
        return JOptionPane.showInputDialog(input);
    }
}
