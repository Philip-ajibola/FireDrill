package estore;

public class WrongPhoneNumberException extends RuntimeException {
    public WrongPhoneNumberException(String wrongPhoneNumber) {
        super(wrongPhoneNumber);
    }
}
