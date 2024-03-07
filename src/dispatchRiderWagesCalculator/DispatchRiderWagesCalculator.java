package dispatchRiderWagesCalculator;

public class DispatchRiderWagesCalculator {


    public static int calculateRidersWages(int numberOfDeliveryMade) {
        int wages = 0;
        if(numberOfDeliveryMade<50) wages = 5000 + (numberOfDeliveryMade *160);
        if(numberOfDeliveryMade>50 && numberOfDeliveryMade<60) wages = 5000 + (numberOfDeliveryMade * 200);
        return wages;
    }
}