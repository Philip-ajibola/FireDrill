package fireDrillTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for(int count = 1; count<=10; count++){
            System.out.println("Enter Scores");
            double scores = input.nextDouble();

            sum += scores;
        }
        System.out.println();
        System.out.printf("Average: %.2f", sum/10.0);

    }
}
