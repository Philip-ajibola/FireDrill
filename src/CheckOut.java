import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CheckOut{
    private static ArrayList<String> items = new ArrayList<String>();
    private static ArrayList<Integer> quantity = new ArrayList<Integer>();
    private static ArrayList<Double> price = new ArrayList<Double>();
    private static double discount;
    private static String customerName;
    private static String cashierName;
    private static Scanner input = new Scanner(System.in);
    private static Date date = new Date();
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy  hh.mm.ss aa");
    private static double VAT = 7.5;
    public static void main(String[] args){


        System.out.println("What's the customer's Name ");
        customerName = input.nextLine();
        System.out.println("What did the user wants to buy? ");
        items.add(input.next());
        System.out.println("How many Pieces? ");
        quantity.add(input.nextInt());
        System.out.println("How much per unit? ");
        price.add(input.nextDouble());

        System.out.println("Add More Items ");
        String moreItems = input.next().toUpperCase();
        while(moreItems.equals("YES")){
            System.out.println("What did the user wants to buy? ");
            items.add(input.next());
            System.out.println("How many Pieces? ");
            quantity.add(input.nextInt());
            System.out.println("How much per unit? ");
            price.add(input.nextDouble());

            System.out.println("Add More Items ");
            moreItems = input.next().toUpperCase();
        }
        System.out.println("What's Your Name? ");
        cashierName = input.next();
        System.out.println("How Much Discount Will The Customer get? ");
        discount = input.nextDouble();
        displayInvoice();
        System.out.println("===============================================================");
        System.out.printf("THIS IS NOT A RECEIPT KINDLY PAY  %.2f%n",overAllTotal());
        System.out.println("===============================================================");
        System.out.println();
        printReceipt();
    }
    public static double sumTotal(){
        double total = 0;
        for(int count = 0;count<quantity.size();count++){
            total += quantity.get(count)*price.get(count);
        }

        return total;
    }

    public static double discount(){
        double discountPrice=(discount/100)*sumTotal();
        return discountPrice;
    }
    public static double VAT(){
        double vatPrice=(VAT/100)*sumTotal();
        return vatPrice;
    }
    public static double overAllTotal(){
        return sumTotal()+discount()+VAT();
    }
    public static void displayInvoice(){
        System.out.println("SEMICOLON STORE");
        System.out.println("MAIN STORE");
        System.out.println("LOCATION: 312,HERBERT MACAULAY WAY,SABO YABA,LAGOS ");
        System.out.println("TEL; 03293828343");
        String currentDate = formatter.format(date).toString();
        System.out.printf("DATE: %s%n",currentDate);
        System.out.printf("CASHIER: %s%n",cashierName);
        System.out.printf("CUSTOMER NAME: %s%n",customerName);

        System.out.println("===============================================================");
        System.out.printf("\t %s%5s%7s%12s%n","ITEM","QTY","PRICE","TOTAL(NGN)");
        System.out.println("---------------------------------------------------------------");

        for(int count = 0;count<quantity.size();count++){
            System.out.printf("%12s",items.get(count));
            System.out.printf("%4d",quantity.get(count));
            System.out.printf("%10.2f",price.get(count));
            double itemTotal =quantity.get(count)*price.get(count) ;
            System.out.printf("%10.2f",itemTotal);
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%20s%10.2f%n","Sub Total",sumTotal());
        System.out.printf("%20s%10.2f%n","Discount",discount());
        System.out.printf("%17s %.1f %10.2f%n","VAT@",VAT,VAT());

        System.out.println("===============================================================");
        System.out.printf("%20s%10.2f%n","Bill Total",overAllTotal());

    }

    public static void printReceipt(){

        System.out.println("How Much Did The Customer Paid ");
        double payment = input.nextDouble();
        double balance = 0;
        System.out.println();
        if(payment>=overAllTotal()){
            balance = payment-overAllTotal();
        }else{
            while(payment<overAllTotal()){
                System.out.println("Please We Don't Sell On Credit Here The \nCustomer Should Pay All The Fee  ");
                System.out.println("How Much Did The Customer Paid ");
                payment = input.nextDouble();
            }
        }
        displayInvoice();
        System.out.printf("%20s%10.2f%n","Amount Paid",payment);
        System.out.printf("%20s%10.2f%n","Balance",balance);

        System.out.println("===============================================================");
        System.out.println("THANKS FOR YOUR PATRONAGE ");
        System.out.println("===============================================================");
    }


}

