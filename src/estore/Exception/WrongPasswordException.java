package estore.Exception;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String wrongPassword) {
        super(wrongPassword);
    }
}
