public class FireDrillSix {

    public int[] returnAnArrayOfElementConsistingZeroAndOnes(int[] array) {
        for(int count = 0; count<array.length;count++)array[count] = array[count]%2;
        return array;
    }

    public boolean[] returnAnArrayOfElementConsistingFalseAndTrue(int[] array) {
        boolean[] returnedArray= new boolean[array.length];
        for(int count = 0; count<array.length;count++){
            returnedArray[count] = array[count]%2 ==1;
        }
        return returnedArray;
    }


    public int[] getArrayELement(int[] array) {
        return array;
    }
}
