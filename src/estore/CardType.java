package estore;

public enum CardType {
    MASTERCARD,
    DISCOVERCARD,
    AMERICAEXPRESS,
    VISACARD;


    public CardType getCardType(String cardNumber1){
        if(cardNumber1.startsWith("5")) return MASTERCARD;
        if (cardNumber1.startsWith("4")) return VISACARD;
        if(cardNumber1.startsWith("6")) return DISCOVERCARD;
        if(cardNumber1.startsWith("37")) return AMERICAEXPRESS;
        return null;
    }
}
