package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        for(int count = 1; count<=10; count++){
            System.out.println("Enter Scores");
            double scores = input.nextInt();
                if(count%2==0) {
                    sum += scores;
                }

        }
        System.out.println();
        System.out.printf("Total of Even Indexes: %.2f",sum);

    }
}
