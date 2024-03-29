package bank;


public class Account {
    private String name;
    private int balance;
    private String pin;
    private int number;

    public Account(String name,int number,String pin){
        this.name = name;
        this.number = number;
        this.pin =pin;
    }
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
        if(amount<0 ) throw new InvalidAmountException("Invalid Amount");
        if(amount>balance) throw new InsufficientFundsException("Insufficient Funds");
        balance -= amount;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }

}
