package estore;


public class Seller extends User {
    public Seller(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        super(name, homeAddress, emailAddress, phoneNumber, password, age);
    }

    @Override
    public void resetPassword(String oldPassword, String newPassword) {
        if(!super.getPassword().equals(oldPassword)) throw new WrongPasswordException("Wrong password");
        super.setPassword(newPassword);
    }

    public void addProduct(Estore estore,Product product) {
        estore.addProductToListOfProduct(product);
    }

    public void removeProduct(Estore estore,String productName) {
        estore.removeProductFromList(productName);

    }


}
