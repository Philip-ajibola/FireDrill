import java.time.LocalDate;


public class FireDrillSeven {
    public static int getAge(String dateOfBirth){
        String[] splitedResult= dateOfBirth.split("/");
        int[] collectionOfDateOfBirth = convertStringArrayToIntArray(splitedResult);
        return calculateYear(collectionOfDateOfBirth);
    }
    public static int[] convertStringArrayToIntArray(String[] array){
        int[] expectedArray =new int[array.length];
        for(int count =0; count<expectedArray.length;count++){
            expectedArray[count] = Integer.parseInt(array[count]);
        }
        return expectedArray;
    }
    public static int calculateYear( int[] array){
        LocalDate currentDate = LocalDate.now();
        if(array[0]==currentDate.getDayOfMonth() && array[1] == currentDate.getMonthValue() && array[2]== currentDate.getYear())return currentDate.getYear() - array[2];
        else if(currentDate.getYear()==array[2]) return 0;
        return currentDate.getYear()-array[2]-1;
    }


}
