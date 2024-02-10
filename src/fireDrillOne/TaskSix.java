package fireDrillOne;

public class TaskSix {
    public static void main(String[] args) {
        int multiplier;int expectedValue;

        for(int count = 1; count<=10;count++){
             expectedValue = count;
            if(count%4==0) {
                for (int counter = 1; counter <= 5; counter++) {
                    multiplier = count;
                    System.out.print(expectedValue + " ");
                    expectedValue *= multiplier;
                }

            }
        }
    }
}
