package fireDrillTwo;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int counter=0;
        for(int count = 1; count<=10; count++){
            System.out.println("Enter Scores");
            double scores = input.nextDouble();
            if(scores%2==0) {
                sum += scores;
                counter++;

            }

        }
        System.out.println();
        System.out.printf("Average Of even Score: %.2f", sum/counter);

    }

}
