package estore;

import estore.Exception.WrongPasswordException;

import java.util.ArrayList;

public class Customer extends User{
    private ShoppingCart shoppingCart = new ShoppingCart();
    private double itemsAmount ;
    private BillingFormat billingFormat;


    public Customer(String name,Address homeAddress, String emailAddress, String phoneNumber, String password, int age,BillingFormat billingFormat) {
        super(name, homeAddress, emailAddress, phoneNumber, password, age);
        this.billingFormat = billingFormat;
    }

    @Override
    public void resetPassword(String oldPassword, String newPassword) {
        if(!super.getPassword().equals(oldPassword)) throw new WrongPasswordException("Wrong password");
        super.setPassword(newPassword);
    }

    public void addItemToCart(Item item) {
        shoppingCart.addItemToShoppingList(item);
    }

    public ArrayList<Item> getItems() {
        return shoppingCart.getItems();
    }

    public void removeItem(Item item) {
        shoppingCart.removeItem(item);
    }

    public double order(Order order) {
        return order.calculateAmount();
    }

    public BillingFormat getBillingFormat() {
        return billingFormat;
    }
}
