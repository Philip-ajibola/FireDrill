package fireDrillOne;

public class TaskEight {
    public static void main(String[] args) {
        int totalSum = 0;
        for(int count = 1; count<=10;count++){
            int result = 0;
            int expectedValue = count;
            if(count%4==0) {
                for (int counter = 1; counter <= 5; counter++) {
                    int multiplier = count;
                    result +=expectedValue;
                    expectedValue *= multiplier;

                }

            }
            totalSum += result;
        }
        System.out.print(totalSum + " ");

    }
}
