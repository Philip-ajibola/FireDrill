package estore;

public class Seller extends User {
    public Seller(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        super(name, homeAddress, emailAddress, phoneNumber, password, age);
    }

    @Override
    public void loginWithPhoneNumber(String phoneNumber, String password) {
        if(!super.getPhoneNumber().equals(phoneNumber)) throw new WrongPhoneNumberException("Wrong Phone Number") ;

    }

    @Override
    public void loginWithEmail(String emailAddress, String password) {

    }

    @Override
    public void resetPassword(String emailAddress, String password) {

    }
}
