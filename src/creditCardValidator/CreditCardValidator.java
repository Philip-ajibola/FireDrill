package creditCardValidator;
import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator {

        private String cardNumber;
        private String cardNumber2;
        private int[] number ;
        private Scanner input = new Scanner(System.in);



        public void setCardNumber(String cardNumber){
            if(cardNumber.length()==13 || cardNumber.length()==16){
                this.cardNumber = cardNumber;
            }
        }
        public void setCardNumber2(String cardNumber2){
            if(cardNumber2.length()!=13 || cardNumber2.length()!=16){
                this.cardNumber2 = cardNumber2;
            }
        }
        public String getCardNumber(){
            return cardNumber;
        }
        public String getCardNumber2(){
            return cardNumber2;
        }
        public void setNumber(){
            if(cardNumber.length()==13 || cardNumber.length()==16){
                this.number = new int[cardNumber.length()];
                for(int count = 0;count<number.length;count++){
                    char character = cardNumber.charAt(count);
                    int intValue = Integer.parseInt(String.valueOf(character));
                    this.number[count] = intValue;
                }
            }
        }
        public int addNumberInEvenPosition(){
            int total = 0;
            int numbers = 0;
            String num = "";
            int numberReturn = 0;
            for(int count = number.length-2;count>=0;count-=2){
                numbers =number[count]*2;
                if(numbers>9){
                    num = ""+numbers;
                    numberReturn = 0;
                    for(int counter = 0;counter<num.length();counter++){
                        char character = num.charAt(counter);
                        int intValue = character - '0';
                        numberReturn += intValue;

                    }

                }
                else if(numbers<=9){
                    numberReturn = numbers;
                }
                total +=numberReturn ;
            }

            return total;
        }

        public int addNumberInOddPosition(){
            int total = 0;
            for(int count = cardNumber.length()-1;count>=0;count-=2){
                total +=number[count];
            }
            return total;
        }
        public void checkStatus(){
            int result = addNumberInOddPosition() + addNumberInEvenPosition();
            if(result%10==0){
                System.out.println("**Credit Card Validity Status: Valid");
            }else{
                System.out.println("**Credit Card Validity Status: Invalid");
            }

        }
        public void checkCreditcardtype(){
            String character ="";
            String character2 ="";
            character +="" + number[0];
            character2 +="" + number[0] + "" + number[1];
            if(character.equals("5")){
                System.out.println("**Credit Card Type: MasterCard");
            }
            else if(character.equals("4")){
                System.out.println("**Credit Card Type: VisaCard");
            }
            else if(character.equals("6")){
                System.out.println("**Credit Card Type: DiscoverCard");
            }
            else if(character2.equals("37")){
                System.out.println("**Credit Card Type: American Express Cards");
            }


        }

        public void displayCreditCardInfo(){
            if(cardNumber.length()==13 || cardNumber.length()==16){
                System.out.println("***********************************************");
                checkCreditcardtype();
                System.out.printf("**Credit Card Number: %s%n",getCardNumber());
                System.out.printf("**Credit Card Digit Length: %d%n",cardNumber.length());
                checkStatus();
                System.out.println("***********************************************");
            }

        }
        public void displayCreditCardInfo2(){
            if(cardNumber2.length()!=13 && cardNumber2.length()!=16){
                System.out.println("***********************************************");
                System.out.println("**Credit Card Type: Invalid");
                System.out.printf("**Credit Card Number: %s%n",getCardNumber2());
                System.out.printf("**Credit Card Digit Length: %d%n",cardNumber2.length());
                System.out.println("**Credit Card Validity Status: Invalid");
                System.out.println("***********************************************");
            }

        }

    }

