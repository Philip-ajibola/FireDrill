package dispatchRiderWagesCalculator;

public class DispatchRiderWagesCalculator {


    public static int calculateRidersWages(int numberOfDeliveryMade) {
        validateNumberOfDelivery(numberOfDeliveryMade);
        return checkNumberOfDeliveryMade(numberOfDeliveryMade);
    }
    private static int checkNumberOfDeliveryMade(int numberOfDeliveryMade){
        if(numberOfDeliveryMade == 0) return 5000;
        if(numberOfDeliveryMade<50) return 5000 + (numberOfDeliveryMade *160);
        if(numberOfDeliveryMade>50 && numberOfDeliveryMade<60) return  5000 + (numberOfDeliveryMade * 200);
        if(numberOfDeliveryMade>60 && numberOfDeliveryMade<70) return 5000 + (numberOfDeliveryMade * 250);
        else  return 5000 + (numberOfDeliveryMade * 500);
    }
    private static void validateNumberOfDelivery(int numberOfDelivery){
        if(numberOfDelivery < 0 || numberOfDelivery>100) throw new IllegalArgumentException("Invalid Delivery number");
    }
}
