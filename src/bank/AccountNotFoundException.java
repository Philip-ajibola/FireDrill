package bank;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String accountNotFound) {
        super(accountNotFound);
    }
}
