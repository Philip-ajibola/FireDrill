package estore;

public class Seller extends User {
    public Seller(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        super(name, homeAddress, emailAddress, phoneNumber, password, age);
    }

    @Override
    public void loginWithPhoneNumber(String phoneNumber, String password) {
        if(!super.getPhoneNumber().equals(phoneNumber)) throw new WrongPhoneNumberException("Wrong PhoneNumber") ;
        if(!super.getPassword().equals(password)) throw new WrongPasswordException("Wrong password") ;

    }

    @Override
    public void loginWithEmail(String emailAddress, String password) {
        if(!super.getEmailAddress().equals(emailAddress)) throw new WrongPhoneNumberException("Wrong PhoneNumber") ;
        if(!super.getPassword().equals(password)) throw new WrongPasswordException("Wrong password") ;
    }

    @Override
    public void resetPassword(String oldPassword, String newPassword) {
        if(!super.getPassword().equals(oldPassword)) throw new WrongPasswordException("Wrong password");
        super.setPassword(newPassword);
    }
}
