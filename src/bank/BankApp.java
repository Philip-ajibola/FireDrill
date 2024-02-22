package bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    private static Bank bank;
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        bank = new Bank("AJIBOLA'S BANK");
        boolean condition2 = true;

        do {
            int userInput = validateUserInput();
            switch (userInput){
                case 1:
                    Account account1 = registerUser();
                    bank.addAccountToAccountList(account1);
                    displayApp(account1);
                    break;
                case 2:
                     boolean condition = true;
                     while (condition) {
                         try {
                             System.out.println("enter Your Account Number ");
                             int accountNumber = input.nextInt();
                             Account account = bank.findAccount(accountNumber);
                                 boolean condition1 = checkIfAccountIsNull(account);
                                 if (condition1) {
                                      System.out.println("Account Does Not Exist ");
                                     condition2 = false;
                                        break;
                                 }
                                 displayApp(account);
                                  condition = false;

                        } catch (InputMismatchException e) {
                             System.out.println("Invalid Input ");
                             input.next();
                        }
                     }
                     break;
                case 3:
                    System.out.println("THANK YOU FOR CHOOSING USING OUR BANK /            GOODBYE");
                    condition2 = false;
            }
            validateUserInput();
        }while (!condition2);
    }
    public static int validateUserInput(){
        int returnedValue = 0;
        boolean condition = true;
        while(condition) {
            try {
                System.out.println("""
                        WELCOME TO AJIBOLA'S BANK :)
                            
                            [<1>] Register Account [<2>] Sign in with account number
                                            
                                                [<3>] Exit App
                        """);
                returnedValue = input.nextInt();
                try {
                    checkIfUserInputIsOutOfRange(returnedValue);
                    condition = false;
                }catch(IllegalArgumentException e){
                    System.out.println("IllegalArgumentException");
                    System.out.println();
                }
            } catch (InputMismatchException e) {
                System.out.println("InputMismatchException");
                input.next();
            }
        }
        return returnedValue;
    }
    public static void checkIfUserInputIsOutOfRange(int number){
    if(number<1 || number>3)throw new IllegalArgumentException("IllegalArgumentException");
    }
    public static Account registerUser(){
        System.out.println("Enter Your First Name ");
        String firstName = input.next();
        System.out.println("Enter Your Last Name");
        String secondName = input.next();
        String pin = verifyPin();
       return bank.registerCustomer(firstName,secondName,pin);
    }
    public static String verifyPin(){
        System.out.println("Set Your Pin");
        String pin = input.next();
        System.out.println("Verify Your Pin ");
        String pinConfirmation = input.next();
        while(!pin.equals(pinConfirmation)){
            System.out.println("Pin misMatch\n Verify Pin ");
            pinConfirmation = input.next();
        }
        return pin;
    }
    public static void displayBank(Account account){
        System.out.printf("""
                    <<<<<<Welcome %s  >>>>>>>>
                        Account Number: %d
                        
                        [<1>] CheckBalance   [<2>] Deposit
                        [<3>] Transfer       [<4>] Withdraw
                        
                                      [<5>] Back
                    
                    """,account.getName(),account.getNumber());
    }
    public static int  collectUsersResponse(){
        int userResponse = 0;
        boolean condition = true;
        while(condition) {
            try {
                userResponse = input.nextInt();
                condition = false;
            } catch (InputMismatchException err) {
                System.out.println("int Expected ");
                input.next();
            }
        }
        return userResponse;
    }
    public static void displayUserResponse(int number, Account account){
        if(number<0 || number>5)throw new IllegalArgumentException("Invalid Input!!");
        switch (number){
            case 1:
                int balance = bank.checkBalance(account.getNumber(),account.getPin());
                System.out.printf("Your Account Balance is: %d",balance);
                break;
            case 2:
                boolean condition = true;
                while(condition) {
                    try {
                        System.out.print("Deposit Amount: ");
                        int deposit = input.nextInt();
                        try {
                            account.deposit(deposit);
                            System.out.printf("%d deposited \n",deposit);
                            condition = false;
                        } catch (InvalidAmountException e) {
                            System.out.println(e.getMessage());
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Int expected");
                        input.next();
                    }
                }
                break;
            case 3:
                 condition = true;
                while(condition) {
                    try {
                        System.out.println("Enter Account want to transfer to ");
                        int accountToTransferTo = input.nextInt();
                        Account account1 = bank.findAccount(accountToTransferTo);
                        System.out.println("Enter Amount ");
                        int amount = input.nextInt();
                        System.out.println("Enter Pin");
                        String pin = input.next();
                        try {
                            if(checkIfAccountIsNull(account1)){
                                System.out.println("Account Does Not Exist ");
                                break;
                            }
                            bank.transfer(account.getNumber(), accountToTransferTo, amount, pin);
                            condition = false;
                        }catch(InvalidAmountException | InsufficientFundsException | InvalidPinException e){
                            System.out.println(e.getMessage());
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid Input\nEnter Account want to transfer to ");
                        input.next();
                    }
                }
                break;
            case 4:
                 condition = true;
                 while(condition) {
                     try {
                         System.out.println("Enter Amount ");
                         int amount = input.nextInt();
                         System.out.println("Enter Pin");
                         String pin = input.next();
                         try {
                             bank.withdraw(account.getNumber(), amount, pin);
                             condition = false;
                         }catch(InvalidAmountException | InsufficientFundsException | InvalidPinException e ){
                             System.out.println(e.getMessage());
                         }
                     } catch (InputMismatchException e) {
                         System.out.println("Invalid Input");
                         input.next();
                     }
                 }
                 break;
            case 5:
                System.out.println();

        }
    }
    public static void displayApp(Account account){
        Account account1 = bank.findAccount(account.getNumber());
        int userResponse = 0;
        do{
            displayBank(account);
             userResponse = collectUsersResponse();
            displayUserResponse(userResponse,account1);
            System.out.println();
        }while(userResponse!=5);
    }

    private static boolean checkIfAccountIsNull(Account account){
        return account == null;
    }
}
