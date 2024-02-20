package bank;

public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String errorMessage){
        super(errorMessage);
    }
}
