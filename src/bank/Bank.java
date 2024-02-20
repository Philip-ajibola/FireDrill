package bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts;
    public Bank(){
        accounts = new ArrayList<>();
    }

    public void deposit(int accountNumber, int amount) {
        Account myAccount = findAccount(accountNumber);
        myAccount.deposit(amount);
    }
    public Account findAccount(int number){
        Account expectedAccount = null;
        for(Account account: accounts) if(account.getNumber()==number){
            expectedAccount=account;
            break;
        }
        return expectedAccount;
    }

    public int checkBalance(int accountNumber, String pin) {
        Account myAccount = findAccount(accountNumber);
       return  myAccount.checkBalance(pin);
    }
    public void addAccountToAccountList(Account account){
        accounts.add(account);
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        Account myAccount = findAccount(accountNumber);
        myAccount.withdraw(amount,pin);
    }

    public Account registerCustomer(String firstName, String secondName, String pin) {
        Account myAccount = new Account();
        myAccount.setName(firstName+" "+secondName);
        myAccount.setPin(pin);
        return myAccount;
    }
    public void transfer(int accountNumber,int accountNumberToBeTransferredTo,int amount,String pin){
        Account myAccount = findAccount(accountNumber);
        Account myAccount2 = findAccount(accountNumberToBeTransferredTo);
        myAccount.withdraw(amount,pin);
        myAccount2.deposit(amount);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void removeAccount(Account account) {
        for(int count = 0; count < accounts.size();count++)
            if(account == accounts.get(count)) accounts.remove(accounts.get(count));
    }
}
