package bank;


public class Account {
    private String name;
    private int balance;
    private String pin;
    private int number;


    public  int checkBalance(String pin) {
        if(!pin.equals(this.pin))throw new InvalidPinException("Invalid Pin ");
        return balance;
    }

    public void deposit(int amount) {
        if(amount<0) throw new InvalidAmountException("Invalid Amount");
        balance += amount;
    }

    public void withdraw(int amount,String pin){
        if(!pin.equals(this.pin))throw new InvalidPinException("Invalid Pin ");
        if(amount<0 || amount>balance) throw new InvalidAmountException("Invalid Amount");
        balance -= amount;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
