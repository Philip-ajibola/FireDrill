package myCheckOut;


    import java.util.Scanner;

import java.util.ArrayList;

    public class CheckOutListApp {

        public static void main(String[] args) {

            Scanner inputCollector = new Scanner(System.in);

            CheckOutList customerCheckout = new CheckOutList();

            ArrayList<String> itemsBoughtList = new ArrayList<>();

            ArrayList<Integer> numberOfPiecesList = new ArrayList<>();

            ArrayList<Double> pricePerUnitList = new ArrayList<>();

            System.out.println("What is the customer's Name");
            String customerName = inputCollector.nextLine();
            customerCheckout.setCustomerName(customerName);
            System.out.println();

            System.out.println("What did the user buy?");
            String itemBought = inputCollector.next();
            itemsBoughtList.add(itemBought);

            System.out.println("How many pieces?");
            int numberOfPieces = inputCollector.nextInt();

            while(numberOfPieces <= 0){

                System.out.println("How many pieces?");
                numberOfPieces = inputCollector.nextInt();

            }

            numberOfPiecesList.add(numberOfPieces);

            System.out.println("How much per unit?");
            double pricePerUnit = inputCollector.nextDouble();

            while(pricePerUnit <= 0){

                System.out.println("How much per unit?");
                pricePerUnit = inputCollector.nextDouble();

            }

            pricePerUnitList.add(pricePerUnit);

            System.out.println("Add more items?");
            String moreItems = inputCollector.next();

            while(moreItems.equalsIgnoreCase("Yes")) {

                System.out.println("What did the user buy?");
                itemBought = inputCollector.next();
                itemsBoughtList.add(itemBought);

                System.out.println("How many pieces?");
                numberOfPieces = inputCollector.nextInt();

                while(numberOfPieces <= 0){

                    System.out.println("How many pieces?");
                    numberOfPieces = inputCollector.nextInt();

                }

                numberOfPiecesList.add(numberOfPieces);

                System.out.println("How much per unit?");
                pricePerUnit = inputCollector.nextDouble();

                while(pricePerUnit <= 0){

                    System.out.println("How much per unit?");
                    pricePerUnit = inputCollector.nextDouble();

                }

                pricePerUnitList.add(pricePerUnit);

                System.out.println("Add more items?");
                moreItems = inputCollector.next();

            }

            inputCollector.nextLine();

            System.out.println("What is your name?");
            String cashierName = inputCollector.nextLine();
            customerCheckout.setCashierName(cashierName);

            System.out.println("How much per discount will he get");
            double discount = inputCollector.nextDouble();
            customerCheckout.setDiscount(discount);
            System.out.println();
            System.out.println();


            double subTotal = customerCheckout.getSubTotal(numberOfPiecesList,pricePerUnitList);

            double discountedPrice = customerCheckout.getDiscountedPrice(subTotal);

            double valueAddedTax = customerCheckout.getValueAddedTax(subTotal);

            double billTotal = customerCheckout.getBillTotal(subTotal, discountedPrice, valueAddedTax);

            String dateAndTime = customerCheckout.getDateAndTime();

            System.out.println("SEMICOLON STORES");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
            System.out.println("TEL: 03293828343");
            System.out.printf("DATE: %s%n", dateAndTime);
            System.out.printf("Cashier: %s%n", customerCheckout.getCashierName());
            System.out.printf("Customer Name: %s%n", customerCheckout.getCustomerName());
            System.out.println("============================================================================");
            System.out.printf("%30s", "ITEM");
            System.out.printf("%10s", "QTY");
            System.out.printf("%10s", "PRICE");
            System.out.printf("%20s%n", "TOTAL(NGN)");
            System.out.println("---------------------------------------------------------------------------");

            for(int count = 0; count < itemsBoughtList.size(); count++){

                double total = pricePerUnitList.get(count) * numberOfPiecesList.get(count);

                System.out.printf("%30s %8d %10.2f %19.2f%n", itemsBoughtList.get(count), numberOfPiecesList.get(count),pricePerUnitList.get(count), total);
            }

            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("%40s %15.2f%n", "Sub Total:", subTotal);
            System.out.printf("%40s %15.2f%n", "Discount:", discountedPrice);
            System.out.printf("%40s %15.2f%n", "VAT @ 17.50%:", valueAddedTax);
            System.out.println("============================================================================");
            System.out.printf("%40s %15.2f%n", "Bill Total:", billTotal);
            System.out.println("============================================================================");
            System.out.printf("THIS IS NOT A RECEIPT KINDLY PAY %.2f%n", billTotal);
            System.out.println("============================================================================");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("How much did the customer give you?");
            double customerPayment = inputCollector.nextDouble();

            while(customerPayment <= 0){

                System.out.println("How much did the customer give you?");
                customerPayment = inputCollector.nextDouble();

            }

            customerCheckout.setCustomerPayment(customerPayment);
            double amountPaid = customerCheckout.getCustomerPayment();
            double balance = customerCheckout.getBalance(billTotal);

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("SEMICOLON STORES");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
            System.out.println("TEL: 03293828343");
            System.out.printf("DATE: %s%n", dateAndTime);
            System.out.printf("Cashier: %s%n", customerCheckout.getCashierName());
            System.out.printf("Customer Name: %s%n", customerCheckout.getCustomerName());
            System.out.println("============================================================================");
            System.out.printf("%30s", "ITEM");
            System.out.printf("%10s", "QTY");
            System.out.printf("%10s", "PRICE");
            System.out.printf("%20s%n", "TOTAL(NGN)");
            System.out.println("---------------------------------------------------------------------------");

            for(int count = 0; count < itemsBoughtList.size(); count++){

                double total = pricePerUnitList.get(count) * numberOfPiecesList.get(count);

                System.out.printf("%30s %8d %10.2f %19.2f%n", itemsBoughtList.get(count), numberOfPiecesList.get(count),pricePerUnitList.get(count), total);
            }

            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("%40s %15.2f%n", "Sub Total:", subTotal);
            System.out.printf("%40s %15.2f%n", "Discount:", discountedPrice);
            System.out.printf("%40s %15.2f%n", "VAT @ 17.50%:", valueAddedTax);
            System.out.println("============================================================================");
            System.out.printf("%40s %15.2f%n", "Bill Total:", billTotal);
            System.out.printf("%40s %15.2f%n", "Amount Paid:", amountPaid);
            System.out.printf("%40s %15.2f%n", "Balance:", balance);
            System.out.println("============================================================================");
            System.out.printf("%45s%n", "THANK YOU FOR YOUR PATRONAGE");
            System.out.println("============================================================================");

        }

    }

