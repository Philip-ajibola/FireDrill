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
      public abstract void resetPassword(String oldPassword,String newPassword);

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

}
