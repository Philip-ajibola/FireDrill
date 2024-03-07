package dispatchRiderWagesCalculator;

public class DispatchRiderWagesCalculator {


    public static int calculateRidersWages(int numberOfDeliveryMade) {
        int wages = 0;
        if(numberOfDeliveryMade<50) wages = 5000 + (numberOfDeliveryMade *160);
        if(numberOfDeliveryMade>50 && numberOfDeliveryMade<60) wages = 5000 + (numberOfDeliveryMade * 200);
        if(numberOfDeliveryMade>60 && numberOfDeliveryMade<69) wages = 5000 + (numberOfDeliveryMade * 250);
        if(numberOfDeliveryMade>=70) wages = 5000 + (numberOfDeliveryMade * 500);
        return wages;
    }
}
