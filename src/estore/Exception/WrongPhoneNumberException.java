package estore.Exception;

public class WrongPhoneNumberException extends RuntimeException {
    public WrongPhoneNumberException(String wrongPhoneNumber) {
        super(wrongPhoneNumber);
    }
}
