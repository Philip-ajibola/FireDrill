package bank;

public class BankApp {
    private static Bank bank;

    public static void main(String[] args) {
        try {
            bank = new Bank();
           Account account =  bank.registerCustomer("philip","ajibola","1234");
           Account account1 = bank.registerCustomer("daniel","goerge","2234");

           account.setNumber(2134567321);
           account1.setNumber(2035647611);

           bank.addAccountToAccountList(account);
            bank.addAccountToAccountList(account1);

           bank.deposit(2134567321,2_000);
           int balance = bank.checkBalance(2134567321,"1234");
            System.out.println(balance);
            bank.withdraw(2134567321,1_500,"1234");
             balance = bank.checkBalance(2134567321,"1234");
            System.out.println();
            System.out.println(balance);

            bank.transfer(2134567321,2035647611,500,"1234");
            int otherAccountBalance = bank.checkBalance(2035647611,"2234");
            System.out.println();
            System.out.println(otherAccountBalance);
            System.out.println();
            balance = bank.checkBalance(2134567321,"1234");
            System.out.println(balance);
        }
        catch (InvalidPinException e){
            System.out.println(e.getMessage());
        }catch (InsufficientFundsException err){
            System.out.println(err.getMessage());
        }catch (InvalidAmountException error){
            System.out.println(error.getMessage());
        }

    }
}
