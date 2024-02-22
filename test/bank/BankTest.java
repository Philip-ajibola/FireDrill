package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    public void testThatICanCheckBalance(){
        Bank  bank = new Bank("AJIBOLA'S BANK");

        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        bank.addAccountToAccountList(account);
        assertEquals(0,bank.checkBalance(account.getNumber(),"correctPin"));

    }
    @Test
    public void testThatICanFindAccount(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        bank.addAccountToAccountList(account);
        assertEquals(account,bank.findAccount(account.getNumber()));
    }
    @Test
    public void testThatICanDepositMoney(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        bank.addAccountToAccountList(account);
        bank.deposit(account.getNumber(),300);
        assertEquals(300,bank.checkBalance(account.getNumber(),"correctPin"));
    }
    @Test
    public void testThatICanWithdrawMoneyFromAccount(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        bank.addAccountToAccountList(account);
        bank.deposit(account.getNumber(),300);
        bank.withdraw(account.getNumber(),200,"correctPin");
        assertEquals(100,bank.checkBalance(account.getNumber(), "correctPin"));
    }@Test
    public void testThatICanWithdrawMoneyFromAccountMoreTHanOnes(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        bank.addAccountToAccountList(account);
        bank.deposit(account.getNumber(),300);
        bank.withdraw(account.getNumber(),200,"correctPin");
        bank.withdraw(account.getNumber(), 100,"correctPin");
        assertEquals(0,bank.checkBalance(account.getNumber(), "correctPin"));
    }
    @Test
    public void testThatAccountCanBeRegistered(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("Philip","Ajibola","1234");

        assertEquals("Philip Ajibola",account.getName());
    }
    @Test
    public void testThatICanTransferFromOneAccountToAnother(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        account.deposit(3_000);
        bank.addAccountToAccountList(account);
        Account myAccount = bank.registerCustomer("firstName","lastName","correctPin");
        bank.addAccountToAccountList(myAccount);
        bank.transfer(account.getNumber(), myAccount.getNumber(), 2_500,"correctPin");
        assertEquals(2_500,bank.checkBalance(myAccount.getNumber(), "correctPin"));
    }
    @Test
    public void testThatICanRemoveAccount(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        bank.addAccountToAccountList(account);
        bank.removeAccount(account,"correctPin");
        System.out.println(account.getNumber());
        assertEquals(0,bank.getAccounts().size());
    }

    @Test
    public void testThatICanGenerateAccountNumber(){
        Bank  bank = new Bank("AJIBOLA'S BANK");
        Account account = bank.registerCustomer("firstName","lastName","correctPin");
        assertEquals(1,account.getNumber());
    }
}