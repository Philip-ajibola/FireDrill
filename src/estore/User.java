package estore;

public abstract class User {
    private String name;
    private String homeAddress;
    private String emailAddress;
    private String phoneNumber;
    private String password;
    private int age;
    public User(String name, String homeAddress, String emailAddress, String phoneNumber, String password, int age){
            this.name = name;
            this.homeAddress = homeAddress;
            this.emailAddress =emailAddress;
            this.password = password;
            this.phoneNumber = phoneNumber;
            this.age = age;
    }
}
