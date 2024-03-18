package estore;

import estore.Exception.WrongPasswordException;

import java.util.ArrayList;

public class Admin extends User {

    public Admin(String name, Address homeAddress, String mail, String number, String password, int age) {
        super(name,homeAddress,mail,number,password,age);
    }

    @Override
    public void resetPassword(String oldPassword, String newPassword) {
        if(!super.getPassword().equals(oldPassword)) throw new WrongPasswordException("Wrong password");
        super.setPassword(newPassword);
    }

    public void addSeller(Seller seller,Estore estore) {
        estore.addSeller(seller);
    }

    public ArrayList<Seller> getSellers(Estore estore) {
        return estore.getSellers();
    }

    public Seller findSeller(Seller seller, Estore estore) {
        return estore.findSeller(seller);
    }

    public void addProductToListOfProduct(Product product,Estore estore) {
        estore.addProduct(product);
    }

    public Product getProducts(String productName,Estore estore) {
        return estore.getProducts(productName);
    }

    public void addCustomer(Customer customer,Estore estore) {
        estore.addCustomer(customer);
    }


    public void removeProductFromList(Product product,Estore estore) {
        estore.removeProduct(product);
    }
    public void removeProductFromList(String productName,Estore estore) {
        estore.removeProduct(productName);
    }

}
