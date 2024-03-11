package estore;

import java.util.ArrayList;

public class Customer extends User{
    private ShoppingCart shoppingCart = new ShoppingCart();


    public Customer(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        super(name, homeAddress, emailAddress, phoneNumber, password, age);
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
}
