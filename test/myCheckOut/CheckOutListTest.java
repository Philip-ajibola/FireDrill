package myCheckOut;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckOutListTest {
    @Test
    public void testSetAndGetCustomerName(){

        CheckOutList checkOutList = new CheckOutList();

        checkOutList.setCustomerName("John Doe");

        String expectedOutput = "John Doe";

        String actualOutput = checkOutList.getCustomerName();

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testGetDateAndTime() {

        CheckOutList checkOutList = new CheckOutList();

        String expectedOutput = checkOutList.getDateAndTime();

        String actualOutput = checkOutList.getDateAndTime();

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSetAndGetDiscount() {

        CheckOutList checkOutList = new CheckOutList();

        checkOutList.setDiscount(17.5);

        double expectedOutput = 17.5;

        double actualOutput = checkOutList.getDiscount();

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testGetSubTotal() {

        CheckOutList checkOutList = new CheckOutList();

        ArrayList<Integer> numberOfPiecesList = new ArrayList<>(Arrays.asList(2, 2));

        ArrayList<Double> pricePerUnitList = new ArrayList<>(Arrays.asList(2100.0, 550.0));

        double expectedOutput = 5300;

        double actualOutput = checkOutList.getSubTotal(numberOfPiecesList, pricePerUnitList);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testGetDiscountedPrice() {

        CheckOutList checkOutList = new CheckOutList();

        checkOutList.setDiscount(17.5);

        double discount = checkOutList.getDiscount();

        double expectedOutput = 927.5;

        double actualOutput = checkOutList.getDiscountedPrice(5300);

        double delta = 0.00001;

        assertEquals(expectedOutput, actualOutput, delta);
    }

    @Test
    public void testSetAndGetCashierName() {

        CheckOutList checkOutList = new CheckOutList();

        checkOutList.setCashierName("Jane Doe");

        String expectedOutput = "Jane Doe";

        String actualOutput = checkOutList.getCashierName();

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testGetValueAddedTax() {

        CheckOutList checkOutList = new CheckOutList();

        double subTotal = 5300;

        double expectedOutput = 927.50;

        double actualOutput = checkOutList.getValueAddedTax(subTotal);

        double delta = 0.00001;

        assertEquals(expectedOutput, actualOutput, delta);

    }

    @Test
    public void testGetBillTotal() {

        CheckOutList checkOutList = new CheckOutList();

        double subTotal = 5300.0;

        double valueAddedTax = 927.50;

        double discountedPrice = 424.0;

        double expectedOutput = 5803.50;

        double actualOutput = checkOutList.getBillTotal(subTotal, discountedPrice, valueAddedTax );

        double delta = 0.00001;

        assertEquals(expectedOutput, actualOutput, delta);

    }

    @Test
    public void testSetAndGetCustomerPayment() {

        CheckOutList checkOutList = new CheckOutList();

        checkOutList.setCustomerPayment(6000);

        double expectedOutput = 6000;

        double actualOutput = checkOutList.getCustomerPayment();

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testGetBalnce() {

        CheckOutList checkoutList = new CheckOutList();

        checkoutList.setCustomerPayment(6000);

        double customerPayment = checkoutList.getCustomerPayment();

        double billTotal = 5803.5;

        double expectedOutput = 196.5;

        double actualOutput = checkoutList.getBalance(billTotal);

        assertEquals(expectedOutput, actualOutput);

    }



}