package fireDrillOne;

public class TaskTen {
    public static void main(String[] args) {
        int totalSum = 0;
        for(int count = 1; count<=10;count++){
            int result = 0;
            int valueHolder = count;
            if(count%4==0) {
                for (int counter = 1; counter <= 5; counter++) {
                    int multiplier = count;
                    result +=valueHolder;
                    valueHolder *= multiplier;

                }

            }
            totalSum += result;
        }
        System.out.print(totalSum * totalSum+ " ");

    }
}
