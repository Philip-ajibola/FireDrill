package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;
    @BeforeEach
    public void initializeAccount(){
        account = new Account("name",123445,"correctPin");
    }

    @Test
    public void testThatAccountBalanceCanBeShown(){
        assertEquals(0,account.checkBalance("correctPin"));
    }
    @Test
    public void testThatMoneyCanBeDepositedIntoAccount(){
        account.deposit(500);
        assertEquals(500,account.checkBalance("correctPin"));

    }
    @Test
    public void testThatMoneyCanBeDepositedIntoAccountTwice(){
        account.deposit(500);
        account.deposit(1_500);
        assertEquals(2_000,account.checkBalance("correctPin"));

    }
    @Test
    public void testThatWhenWrongPinIsEnteredErrorShouldBeThrown(){
        account.deposit(500);
        account.deposit(1_500);
        assertThrows(InvalidPinException.class,()->account.withdraw(1_500,"wrongPin"));

    }
    @Test
    public void testThatWhenPinIsWrongErrorIsThrown(){
        account.deposit(2000);
        assertThrows(InvalidPinException.class,()->account.checkBalance("wrongPin"));
    }
    @Test
    public void testThatMoneyCanBeWithdrawFromAccount(){
        account.deposit(500);
        account.deposit(1_500);
        account.withdraw(1000,"correctPin");
        assertEquals(1_000,account.checkBalance("correctPin"));
    }
    @Test
    public void testThatWhenInvalidAmountItShouldThrowError(){
        account.deposit(500);
        account.deposit(1_500);
        assertThrows(InsufficientFundsException.class,()->account.withdraw(2_100,"correctPin"));
    }
    @Test
    public void testThatWhenInValidAmountIsDepositedErrorIsThrown(){
        account.deposit(500);
        account.deposit(1_500);
        assertThrows(InvalidAmountException.class,()->account.deposit(-2_100));
    }
    @Test
    public void testThatWhenInValidAmountIsWithdrawnErrorIsThrown(){
        account.deposit(500);
        account.deposit(1_500);
        assertThrows(InvalidAmountException.class,()->account.withdraw(-2_100,"correctPin"));
    }
    @Test
    public void testThatWhenWrongPinIsEnteredErrorMessageBeShown(){
        account.deposit(5000);
        assertThrows(InvalidPinException.class,()->account.withdraw(300,"wrongPin"));
    }


}