import java.util.ArrayList;
import java.util.Scanner;

public class FireDrill4 {

    public static void main(String[] args) {
       ArrayList<Integer> numbers = collectNumberIntoArrayList();
        for(Integer number: numbers) displayNumberInFormOfStar(number);
    }
    public static void displayNumberInFormOfStar(int number){
        String result = "";
        for(int counter = 0; counter<number;counter++){
            result += "*";
        }
        System.out.println(result);
    }

    public static ArrayList<Integer> collectNumberIntoArrayList(){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        while(true){
            System.out.println("Enter Number From 1-15 / Enter 22 When you are tired ");
            userInput = input.nextInt();

            if(userInput==22) break;
            numbers.add(userInput);

        }
        return numbers;
    }
}
