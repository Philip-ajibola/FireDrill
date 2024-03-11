package estore;

public class WrongPhoneNumberException extends Throwable {
    public WrongPhoneNumberException(String wrongPhoneNumber) {
        super(wrongPhoneNumber);
    }
}
