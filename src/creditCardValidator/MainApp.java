package creditCardValidator;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        CreditCardValidator validator = new CreditCardValidator();
        Scanner input = new Scanner(System.in);
        String theCardNumber = "";
        boolean condition = true;
        while(condition) {
            try {
                System.out.println("Hello, Kindly Enter Card Details To Verify ");
                theCardNumber = input.next();
                condition = false;
            } catch (Exception e) {
                System.out.println("Invalid Input \n Please Enter A Valid Input ");
                input.next();
            }
        }
        validator.setCardNumber(theCardNumber);
        validator.setCardNumber2(theCardNumber);
        if(theCardNumber.length()==13 || theCardNumber.length()==16){
            validator.setNumber();
            validator.displayCreditCardInfo();

        }
        else{
            validator.displayCreditCardInfo2();
        }
    }



}
