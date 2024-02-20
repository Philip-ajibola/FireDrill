package bank;

public class InvalidAmountException extends RuntimeException{

    public  InvalidAmountException(String errorMessage){
        super(errorMessage);
    }
}
