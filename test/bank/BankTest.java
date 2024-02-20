package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank bank;
    @BeforeEach
    public void initializeBank(){
        bank = new Bank();

    }
    @Test
    public void testThatICanCheckBalance(){
        Account account = new Account();
        account.setPin("1234");
        account.setNumber(2145678911);
        bank.addAccountToAccountList(account);
        assertEquals(0,bank.checkBalance(2145678911,"1234"));

    }
    @Test
    public void testThatICanFindAccount(){
        Account account = new Account();
        account.setPin("1234");
        account.setNumber(2145678911);
        bank.addAccountToAccountList(account);
        assertEquals(account,bank.findAccount(2145678911));
    }
    @Test
    public void testThatICanDepositMoney(){
        Account account = new Account();
        account.setPin("1234");
        account.setNumber(2145678911);
        bank.addAccountToAccountList(account);
        bank.deposit(2145678911,300);
        assertEquals(300,bank.checkBalance(2145678911,"1234"));
    }
    @Test
    public void testThatICanWithdrawMoneyFromAccount(){
        Account account = new Account();
        account.setPin("1235");
        account.setNumber(2145678911);
        bank.addAccountToAccountList(account);
        bank.deposit(2145678911,300);
        bank.withdraw(2145678911,200,"1235");
        assertEquals(100,bank.checkBalance(2145678911,"1235"));
    }@Test
    public void testThatICanWithdrawMoneyFromAccountMoreTHanOnes(){
        Account account = new Account();
        account.setPin("1234");
        account.setNumber(2145678911);
        bank.addAccountToAccountList(account);
        bank.deposit(2145678911,300);
        bank.withdraw(2145678911,200,"1234");
        bank.withdraw(2145678911,100,"1234");
        assertEquals(0,bank.checkBalance(2145678911,"1234"));
    }
    @Test
    public void testThatAccountCanBeRegistered(){
        Account account = bank.registerCustomer("Philip","Ajibola","1234");

        assertEquals("Philip Ajibola",account.getName());
    }
    @Test
    public void testThatICanTransferFromOneAccountToAnother(){
        Account account = new Account();
        account.setPin("1234");
        account.setNumber(2145678911);
        account.deposit(3_000);
        bank.addAccountToAccountList(account);
        Account myAccount = new Account();
        myAccount.setPin("2324");
        myAccount.setNumber(2145876912);
        bank.addAccountToAccountList(myAccount);
        bank.transfer(2145678911,2145876912,2_500,"1234");
        assertEquals(2_500,bank.checkBalance(2145876912,"2324"));


    }
    @Test
    public void testThatICanRemoveAccount(){
        Account account = new Account();
        account.setPin("1234");
        account.setNumber(2145678911);
        bank.addAccountToAccountList(account);
        bank.removeAccount(account);
        assertEquals(0,bank.getAccounts().size());
    }
}