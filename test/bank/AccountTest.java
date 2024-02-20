package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;
    @BeforeEach
    public void initializeAccount(){
        account = new Account();
    }

    @Test
    public void testThatAccountBalanceCanBeShown(){
        account.setPin("1234");
        assertEquals(0,account.checkBalance("1234"));
    }
    @Test
    public void testThatMoneyCanBeDepositedIntoAccount(){
        account.deposit(500);
        account.setPin("5677");
        assertEquals(500,account.checkBalance("5677"));

    }
    @Test
    public void testThatMoneyCanBeDepositedIntoAccountTwice(){
        account.deposit(500);
        account.deposit(1_500);
        account.setPin("2222");
        assertEquals(2_000,account.checkBalance("2222"));

    }
    @Test
    public void testThatWhenWrongPinIsEnteredErrorShouldBeThrown(){
        account.deposit(500);
        account.deposit(1_500);
        account.setPin("2222");
        assertThrows(InvalidPinException.class,()->account.withdraw(1_500,"1234"));

    }
    @Test
    public void testThatWhenPinIsWrongErrorIsThrown(){
        account.setPin("2323");
        account.deposit(2000);
        assertThrows(InvalidPinException.class,()->account.checkBalance("1234"));
    }
    @Test
    public void testThatMoneyCanBeWithdrawFromAccount(){
        account.deposit(500);
        account.deposit(1_500);
        account.setPin("1234");
        account.withdraw(1000,"1234");
        assertEquals(1_000,account.checkBalance("1234"));
    }
    @Test
    public void testThatWhenInvalidAmountItShouldThrowError(){
        account.deposit(500);
        account.deposit(1_500);
        account.setPin("1234");
        assertThrows(InvalidAmountException.class,()->account.withdraw(2_100,"1234"));
    }
    @Test
    public void testThatWhenInValidAmountIsDepositedErrorIsThrown(){
        account.deposit(500);
        account.deposit(1_500);
        account.setPin("1234");
        assertThrows(InvalidAmountException.class,()->account.deposit(-2_100));
    }
    @Test
    public void testThatWhenInValidAmountIsWithdrawnErrorIsThrown(){
        account.deposit(500);
        account.deposit(1_500);
        account.setPin("1234");
        assertThrows(InvalidAmountException.class,()->account.withdraw(-2_100,"1234"));
    }




}