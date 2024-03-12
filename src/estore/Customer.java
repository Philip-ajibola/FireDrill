package estore;

public class Customer extends User{


    public Customer(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age) {
        super(name, homeAddress, emailAddress, phoneNumber, password, age);
    }

    @Override
    public void resetPassword(String oldPassword, String newPassword) {
        if(!super.getPassword().equals(oldPassword)) throw new WrongPasswordException("Wrong password");
        super.setPassword(newPassword);
    }
}
