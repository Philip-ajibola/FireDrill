package bank;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    private static Bank bank;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        bank = new Bank("AJIBOLA'S BANK");
        boolean condition2 = true;
        displayApp();

    }
    private static void displayApp(){
        String userResponse = input("""
                >>>>> Welcome to AJIBOLA"S BANK >>>>>
                    
                    What would you like to do with us :)
                    
                    [<1>] Register An Account  [<2>] Sign In With Account Number 
                    
                                    [<3>] Exit App
                """);
        try{
            int response = Integer.parseInt(userResponse);
            displayResponseToUserOption(response);
        }catch (Exception e){
            print("Input MisMatch ");
            displayApp();
        }

    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null,prompt);
    }
    private static void displayResponseToUserOption(int userResponse){
        switch(userResponse){
            case 1 -> createAccount();
            case 2 ->loginWithAccountNumber();
            case 3 -> print("Thank You For Choosing Our Bank");
            default ->  {print("Invalid Input");displayApp();}
        }
    }
    private static void loginWithAccountNumber(){
            try {
                int accountNumber = Integer.parseInt(input("Enter account Number"));
                displayOptionOfWhatUserShouldDo(bank.findAccount(accountNumber));
            } catch (Exception e) {
                print("" + e);
            }finally {
                displayApp();
            }
    }
    private static void displayOptionOfWhatUserShouldDo(Account account) {
        String userResponse = input("""
                Hello \s""" + account.getName() + """
                \nYour Account Number is  """ + account.getNumber() + """
                
                <<<<<<< What Would You Love To Do With Us Today >>>>>> +
                    [<1>] withdraw           [<2>] Deposit
                    
                    [<3>] Transfer           [<4>] Close Account
                         
                     [<5>] Check Balance     [<6>] Back
                """);
        try{
            displayWhatUserWantsToDo(userResponse,account);

        }catch(Exception e) {
            print(" "+e.getMessage());
            displayOptionOfWhatUserShouldDo(account);
        }
    }

    private static void print(String s) {
        JOptionPane.showMessageDialog(null,s);
    }

    private static void createAccount() {
        collectUserName();
    }
    private static void collectUserName(){
        boolean condition = true;
        while (condition){
        try{
            String firstName = input("Enter Your First Name ");
            String lastName = input("Enter Your Last Name ");
            verifyUserName(firstName,lastName);
            String pin = verifyPin();
            displayOptionOfWhatUserShouldDo(bank.registerCustomer(firstName,lastName,pin));
            condition = false;
        }catch (Exception e){
            print("" + e);
        }
        }
    }
    private static void verifyUserName(String firstName, String lastName){
        if(!firstName.matches("[a-zA-Z]+"))throw new IllegalArgumentException("First name but be of alphabetical numbers alone ");
        if(!lastName.matches("[a-zA-Z]+"))throw new IllegalArgumentException("Last name but be of alphabetical numbers alone ");
    }
    private static String verifyPin(){
        String pin = input("Enter Your Pin ");
        if(!pin.matches("[0-9]+"))throw new InvalidPinException("Pin should be of digit only ");
        String verifyPin = input("verify Your Pin ");
        if(!pin.equals(verifyPin)) throw new InvalidPinException("Invalid Pin");
        return pin;
    }
    private static void displayWhatUserWantsToDo(String userResponse, Account account){
        if(!userResponse.matches("[0-9]+"))throw new IllegalArgumentException("Wrong Input \nEnter The Correct Input ");

        switch (Integer.parseInt(userResponse)){
            case 1->withdraw(account);
            case 2->deposit(account);
            case 3->transfer(account);
            case 4->closeAccount(account);
            case 5->checkBalance(account);
            case 6-> displayApp();
            default -> displayOptionOfWhatUserShouldDo(account);
        }
    }

    private static void checkBalance(Account account) {
        String pin = input("Enter Your Pin");
        try {
            print("Your Account Balance is " + bank.checkBalance(account.getNumber(), pin));
        }catch(Exception e){
            print(" "+e.getMessage());
        }finally {
            displayOptionOfWhatUserShouldDo(account);
        }
    }

    private static void closeAccount(Account account) {
        String pin = input("Enter Your Pin");
        bank.removeAccount(account,pin);
        print("Account Deactivated ");
        displayApp();
    }

    private static void transfer(Account account) {
        String accountToTransferTo = input("Enter Account Number You  Want To Transfer To");
        String amount = input("Enter  The Amount You Want To Transfer ");
        String pin = input("Enter Your Pin ");
        try{
            if(!amount.matches("[0-9]+"))throw new IllegalArgumentException("Invalid Amount");
            int expectedAccount = Integer.parseInt(accountToTransferTo);
            int amountToBeTransferred = Integer.parseInt(amount);
            Account account1 = bank.findAccount(expectedAccount);
            bank.transfer(account.getNumber(),expectedAccount,amountToBeTransferred,pin);
            print("Transaction Successful");
        }catch(Exception e){
            print(" " + e.getMessage());
        }finally {
            displayOptionOfWhatUserShouldDo(account);
        }
    }
    private static void deposit(Account account) {
        String amount = input("Enter Amount You Want To deposit");
        try{
                if(!amount.matches("[0-9]+"))throw new IllegalArgumentException("Invalid Amount Entered ");
                int amountToBeDeposited = Integer.parseInt(amount);
                bank.deposit(account.getNumber(),amountToBeDeposited);
                print("Money Deposited Successfully ");
        }catch(Exception e){
            print(" " + e.getMessage());
        }finally {
            displayOptionOfWhatUserShouldDo(account);
        }
    }
    private static void withdraw(Account account) {
        String amount = input("Enter Amount You Want To withdraw");
        String pin = input("Enter Your Pin");
        try {
            if(!amount.matches("[0-9]+"))throw new IllegalArgumentException("Invalid Amount");
            int amountToBeWithdrawn = Integer.parseInt(amount);
            bank.withdraw(account.getNumber(), amountToBeWithdrawn,pin);
            print("Withdrawal SuccessFul");
        }catch(Exception e){
            print(" " + e.getMessage());
        }finally {
            displayOptionOfWhatUserShouldDo(account);
        }
    }

}
