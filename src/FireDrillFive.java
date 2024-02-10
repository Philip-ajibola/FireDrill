import java.util.Arrays;

public class FireDrillFive{
    public static int[] doubleLengthOfArray(int[] array){
        int[] expectedArray = new int[array.length*2];
        return expectedArray;
    }
    public static int[] returnDoubleLengthOfArray(int[] array){
       int[] expectedArray = doubleLengthOfArray(array);
        for(int count = 0;count<array.length;count++){
            expectedArray[count] = array[count];
             expectedArray[count+ array.length]=array[count]*2;
        }
        return expectedArray;
    }

    public static void main(String[] args) {
        int[] array = {4,5,8};
        int[] result = returnDoubleLengthOfArray(array);
        System.out.println(Arrays.toString(result));

    }
}