package estore;


import estore.Exception.WrongPasswordException;

public class Seller extends User {
    public Seller(String name, Address homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        super(name, homeAddress, emailAddress, phoneNumber, password, age);
    }

    @Override
    public void resetPassword(String oldPassword, String newPassword) {
        if(!super.getPassword().equals(oldPassword)) throw new WrongPasswordException("Wrong password");
        super.setPassword(newPassword);
    }

    public void addProduct(Admin admin,Product product,Estore estore) {
        admin.addProductToListOfProduct(product,estore);
    }

    public void removeProduct(Admin admin,Product product,Estore estore) {
        admin.removeProductFromList(product,estore);
    }
    public void removeProduct(Admin admin,String productName,Estore estore) {
        admin.removeProductFromList(productName,estore);
    }


}
