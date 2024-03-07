package dispatchRiderWagesCalculator;

public class DispatchRiderWagesCalculator {


    public static int calculateRidersWages(int numberOfDeliveryMade) {
        validateNumberOfDelivery(numberOfDeliveryMade);
        return checkNumberOfDeliveryMade(numberOfDeliveryMade);
    }
    private static int checkNumberOfDeliveryMade(int numberOfDeliveryMade){
        if(numberOfDeliveryMade<50) return 5000 + (numberOfDeliveryMade *160);
        if(numberOfDeliveryMade>50 && numberOfDeliveryMade<60) return  5000 + (numberOfDeliveryMade * 200);
        if(numberOfDeliveryMade>60 && numberOfDeliveryMade<69) return 5000 + (numberOfDeliveryMade * 250);
        else  return 5000 + (numberOfDeliveryMade * 500);
    }
    private static void validateNumberOfDelivery(int numberOfDelivery){
        if(numberOfDelivery == 0) throw new IllegalArgumentException("No Delivery Was Made\n No wages for you");

    }
}
