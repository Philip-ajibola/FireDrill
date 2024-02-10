package chaptherThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public  void depositPositiveAmount_balanceIncreasesTest(){
        Account philipAccount = new Account();
        assertEquals(0, philipAccount.getBalance());

        philipAccount.deposit(-50_000);
        assertEquals(0, philipAccount.getBalance());

    }
    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest(){
        Account philipAccount = new Account();
        assertEquals(0, philipAccount.getBalance());

        philipAccount.deposit(2_000);
        philipAccount.deposit(6_000);
        assertEquals(8_000, philipAccount.getBalance());
    }
    @Test
    public void depositZeroAmountTest(){
        Account philipAccount = new Account();
        assertEquals(0, philipAccount.getBalance());

        philipAccount.deposit(0);
        assertEquals(0, philipAccount.getBalance());
    }
    @Test
    public void depositNegativeBalance_balanceRemainUnChangedTest(){
        Account myAccount = new Account();
        assertEquals(0,myAccount.getBalance());
        myAccount.deposit(-50_000);
        assertEquals(0,myAccount.getBalance());
    }
    @Test
    public void withdrawAmountLowerTHanThTest(){
    Account myAccount = new Account();
    assertEquals(0,myAccount.getBalance());
    myAccount.withdraw(-20_000);
    assertEquals(0,myAccount.getBalance());


    }
    @Test
    public void withdrawAmountLowerTHanTheBalanceTest(){
        Account myAccount = new Account();
        assertEquals(0,myAccount.getBalance());
        myAccount.deposit(5_000);
        myAccount.withdraw(3_000);
        assertEquals(2_000,myAccount.getBalance());
    }

    @Test
    public void withdrawAmountHigherTHanTheBalanceTest(){
        Account myAccount = new Account();
        assertEquals(0,myAccount.getBalance());
        myAccount.deposit(5000);
        myAccount.withdraw(6000);
        assertEquals(5_000,myAccount.getBalance());
    }

    @Test
    public void withdrawZeroAmountTest(){
        Account myAccount = new Account();
        assertEquals(0,myAccount.getBalance());
        myAccount.deposit(5000);
        myAccount.withdraw(0);
        assertEquals(5_000,myAccount.getBalance());
    }


}