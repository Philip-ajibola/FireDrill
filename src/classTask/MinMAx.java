package classTask;

public class MinMAx {

    public static int[] getMinMax(int[] array) {
        int[] result = new int[2];
        int total = 0;
        for(int count = 0; count<array.length;count++) {
            total += array[count];
        }
        int max = 0;
        int min = total;
        for(int number: array){
            if((total-number) > max) max = total-number;
            if((total-number) < min) min = total-number;
        }
        return result = new int[]{min,max};
    }

    }
