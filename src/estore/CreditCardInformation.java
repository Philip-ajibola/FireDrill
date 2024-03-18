package estore;
import estore.Exception.InValidCardType;

import static estore.CardType.*;
public class CreditCardInformation {
    private String ccV;
    private String cardNumber;
    private CardType cardType = MASTERCARD;
    public CreditCardInformation(String ccV,String cardNumber){
        this.ccV = ccV;
        validateCardNumber(cardNumber);
        this.cardNumber= cardNumber;
        cardType = cardType.getCardType(this.cardNumber);
    }

    public CardType getCardType() {
        return cardType;
    }

    private void validateCardNumber(String cardNumber){
        if(cardNumber.length() != 13  && cardNumber.length() != 16)throw new InValidCardType("Invalid Card Type");
        if(cardNumber.charAt(0) != '4' && cardNumber.charAt(0) != '5' &&cardNumber.charAt(0) != '6' && !cardNumber.startsWith("37")) throw new InValidCardType("Invalid Card Type");
    }
}
