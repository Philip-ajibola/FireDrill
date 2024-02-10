import java.util.Scanner;
public class FireDrillThree {
    Scanner input = new Scanner(System.in);

    public double[] taskOne(double... score) {
        double[] scoreArray = new double[10];
        for(int count = 0; count<score.length;count++){
            scoreArray[count] = score[count];
        }
        return scoreArray;
    }
    public String taskTwo(double[] array){
      //  double[] array = taskOne(score);
        String result ="";
        for (int count = 0; count <array.length; count++) {
            result += array[count] + "\n";
        }
        return result;
    }

    public String taskThree(double[] array){
       // double[] array = taskOne(score);
        String result ="";
        for (int count = 0; count <array.length; count++) {
            result += array[count] +" ";
        }
        return result;
    }
    public int[] taskFour(int[] array) {
        int counter = 0;
        if (array.length % 2 == 0) {
            int[] theReturningArray = new int[array.length / 2];

            for (int count = 0; count < array.length; count++) {
                if (count % 2 == 0) {
                    theReturningArray[counter] = array[count];
                    counter++;
                }
            }
            return theReturningArray;
        } else {
            int[] theReturningArray = new int[array.length / 2 + 1];
            for (int count = 0; count < array.length; count++) {
                if (count % 2 == 0) {
                    theReturningArray[counter] = array[count];
                    counter++;
                }

            }
            return theReturningArray;

        }

    }

    public int[] taskFive(int[] array) {
        int counter = 0;
            int[] theReturningArray = new int[array.length / 2];

            for (int count = 0; count < array.length; count++) {
                if (count % 2 != 0) {
                    theReturningArray[counter] = array[count];
                    counter++;
                }
            }
            return theReturningArray;


    }
    public int taskSix(int[] array){
      int[]  taskFourResult = taskFour(array);
      int sum = 0;
        for(int count = 0;count<taskFourResult.length;count++){
            sum += taskFourResult[count];
        }
        return sum;
    }

    public int taskSeven(int[] array){
        int[]  taskFiveResult = taskFive(array);
        int sum = 0;
        for(int count = 0;count<taskFiveResult.length;count++){
            sum += taskFiveResult[count];
        }
        return sum;
    }
    public int taskEight(int[] array){
        int[] arrayHolder = taskFour(array);

        int minimum = arrayHolder[0];
        for(int count = 0;count<arrayHolder.length;count++){
            if(arrayHolder[count]<minimum){
                minimum=arrayHolder[count];
              //  System.out.println(minimum);
            }
        }
        return minimum;
    }

    public int taskNine(int[] array){
        int[] arrayHolder = taskFive(array);
        int minimum = arrayHolder[0];
        for(int count = 0;count<arrayHolder.length;count++){
            if(arrayHolder[count]<minimum){
                minimum=arrayHolder[count];
            }
        }
        return minimum;
    }

    public int taskTen(int[] array){
        int[] arrayHolder = taskFour(array);
        int maximum = arrayHolder[0];
        for(int count = 0;count<arrayHolder.length;count++){
            if(arrayHolder[count]>maximum){
                maximum=arrayHolder[count];
            }
        }
        return maximum;
    }

    public int taskEleven(int [] array){
        int[] arrayHolder = taskFive(array);
        int maximum = arrayHolder[0];
        for(int count = 0;count<arrayHolder.length;count++){
            if(arrayHolder[count]>maximum){
                maximum=arrayHolder[count];
            }
        }
        return maximum;
    }
    public int[] taskTwelve(int [] array) {
        int temp = 0;
        if (array.length % 2 == 0) {
            for (int count = 1; count <= array.length; count++) {
                if ((count - 1) % 2 == 0) {
                    temp = array[count - 1];
                    array[count - 1] = array[count];
                    array[count] = temp;
                    //result[count]=temp[count/2];
                }
            }

        } else {
            for (int count = 1; count <= array.length - 1; count++) {
                if ((count - 1) % 2 == 0) {
                    temp = array[count - 1];
                    array[count - 1] = array[count];
                    array[count] = temp;
                    //result[count]=temp[count/2];
                }
            }
        }
            return array;
    }
    public int[] taskFourteen(int[] array){
        int temp = 0;
        if (array.length % 2 == 0) {
            int [] valueHolder = new int[array.length];
            for (int count = 1; count < array.length; count+=2) {
                if(array[count-1]%2==0 && array[count]%2 ==0) {
                    temp = array[count];
                    array[count] = array[count - 1];
                    array[count - 1] = temp;
                }
            }
            return array;
        } else {
            int[] result = new int[array.length-1];
            int holder = array[array.length-1];
            for(int count = 0;count<result.length;count++){
                result[count] = array[count];
            }
            for (int count = 1; count <result.length; count+=2) {
                if (array[count] % 2 == 0 & array[count-1] % 2 == 0) {
                    temp =result[count];
                    result[count]=result[count-1];
                    result[count-1] = temp;
                }
            }
            for(int count = 0;count<result.length;count++){
                array[count] = result[count];
            }
            array[array.length-1]=holder;
        }
        return array;
    }

    public int[] taskThirteen(int[] array){
        int temp = 0;
        if (array.length % 2 == 0) {
            int [] valueHolder = new int[array.length];
            for (int count = 1; count < array.length; count+=2) {
                if(array[count-1]%2!=0 && array[count]%2 !=0) {
                    temp = array[count];
                    array[count]=array[count-1];
                    array[count-1] = temp;

                }
            }
                return array;
        } else {
            int[] result = new int[array.length-1];
            int holder = array[array.length-1];
            for(int count = 0;count<result.length;count++){
                result[count] = array[count];
            }
            for (int count = 1; count <result.length; count+=2) {
                    if (array[count] % 2 != 0 & array[count-1] % 2 != 0) {
                            temp =result[count];
                            result[count]=result[count-1];
                            result[count-1] = temp;
                    }
            }
           for(int count = 0;count<result.length;count++){
               array[count] = result[count];
            }
            array[array.length-1]=holder;
        }
        return array;

    }

    public int[] taskFifteen(int[] array){
        int temp = 0;
        if (array.length % 2 == 0) {
            for (int count = 1; count < array.length; count+=2) {
                if((array[count-1]%2==0 && array[count]%2 !=0) ||(array[count-1]%2!=0 && array[count]%2 ==0)||(array[count-1]%2==0 && array[count]%2 ==0)) {
                    temp = array[count];
                    array[count]=array[count-1];
                    array[count-1] = temp;

                }

            }
            return array;
        } else {
            int[] result = new int[array.length-1];
            int holder = array[array.length-1];
            for(int count = 0;count<result.length;count++){
                result[count] = array[count];
            }
            for (int count = 1; count <result.length; count+=2) {
                if((array[count-1]%2==0 && array[count]%2 !=0) ||(array[count-1]%2!=0 && array[count]%2 ==0)||(array[count-1]%2==0 && array[count]%2 ==0)) {
                    temp =result[count];
                    result[count]=result[count-1];
                    result[count-1] = temp;
                }
            }
            for(int count = 0;count<result.length;count++){
                array[count] = result[count];
            }
            array[array.length-1]=holder;
        }
        return array;

    }


    public int[] taskSixteen(int[] array){
        int temp = 0;
        if (array.length % 2 == 0) {
            int [] valueHolder = new int[array.length];
            for (int count = 1; count < array.length; count+=2) {
                if((array[count-1]%2==0 && array[count]%2 !=0) ||(array[count-1]%2!=0 && array[count]%2 ==0) || (array[count-1]%2!=0 && array[count]%2 !=0)) {
                    temp = array[count];
                    array[count]=array[count-1];
                    array[count-1] = temp;

                    //valueHolder[count-1] = array[count];
                    // valueHolder[count] = array[count-1];
                }
                //  System.out.println("yes");
            }
            return array;
        } else {
            int[] result = new int[array.length-1];
            int holder = array[array.length-1];
            for(int count = 0;count<result.length;count++){
                result[count] = array[count];
            }
            for (int count = 1; count <result.length; count+=2) {
                if ((array[count-1]%2==0 && array[count]%2 !=0) ||(array[count-1]%2!=0 && array[count]%2 ==0)||(array[count-1]%2!=0 && array[count]%2 !=0)) {
                    temp =result[count];
                    result[count]=result[count-1];
                    result[count-1] = temp;
                }
            }
            for(int count = 0;count<result.length;count++){
                array[count] = result[count];
            }
            array[array.length-1]=holder;
        }
        return array;

    }



}

