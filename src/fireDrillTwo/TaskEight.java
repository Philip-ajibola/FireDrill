package fireDrillTwo;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for(int count = 1; count<=10; count++){
            System.out.println("Enter Scores");
            double scores = input.nextDouble();
            while(scores<0 || scores>100) {
                System.out.println("Enter A valid Score ");
                scores = input.nextDouble();
            }
            sum += scores;
        }
        System.out.println();
        System.out.printf("Total: %.2f",sum);

    }
}
