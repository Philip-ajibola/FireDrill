package myCheckOut;

import java.util.ArrayList;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class CheckOutList {

    private String customerName;

    private String cashierName;

    private double discount;

    private double customerPayment;

    public void setCustomerName(String customerName) {

        this.customerName = customerName;

    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCashierName(String cashierName){

        this.cashierName = cashierName;

    }

    public String getCashierName() {

        return cashierName;

    }

    public String getDateAndTime() {

        LocalDateTime dateAndTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm:ss a");

        return dateAndTime.format(dateTimeFormat);

    }


    public void setDiscount(double discount) {

        this.discount = discount;

    }

    public double getDiscount() {

        return discount;

    }

    public double getSubTotal(ArrayList<Integer> numberOfPiecesList, ArrayList<Double> pricePerUnitList) {

        double subTotal = 0;

        for(int count = 0; count < numberOfPiecesList.size(); count++) {

            subTotal += pricePerUnitList.get(count) * numberOfPiecesList.get(count);

        }

        return subTotal;
    }

    public double getDiscountedPrice(double subTotal) {

        double discountedPrice = (discount / 100.0) * subTotal;

        return discountedPrice;

    }

    public double getValueAddedTax(double subTotal) {

        double valueAddedTax  = (17.5 / 100) * subTotal;

        return valueAddedTax;
    }

    public double getBillTotal(double subTotal, double discountedPrice, double valueAddedTax) {

        double billTotal = subTotal + valueAddedTax - discountedPrice ;

        return billTotal;
    }

    public void setCustomerPayment(double customerPayment) {

        this.customerPayment = customerPayment;

    }

    public double getCustomerPayment() {

        return customerPayment;

    }

    public double getBalance(double billTotal) {

        double balance = customerPayment - billTotal;

        return balance;
    }

}


