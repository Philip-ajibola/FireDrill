package fireDrillOne;

public class TaskSeven {
    public static void main(String[] args) {
        for(int count = 1; count<=10;count++){
            int result = 0;
            int num = count;
            if(count%4==0) {
                for (int counter = 1; counter <= 5; counter++) {
                    int num1 = count;
                    result +=num;
                    num *= num1;

                }

                System.out.print(result + " ");
            }
        }
    }
}

