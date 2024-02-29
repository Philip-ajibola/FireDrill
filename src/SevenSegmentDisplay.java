public class SevenSegmentDisplay {
    public static void displaySevenSegmentDisplay(String binaryInput){
        boolean[] binary = new boolean[7];
        for(int count = 0;count< binary.length;count++) if (binaryInput.charAt(count) == '1') binary[count] = true;
        printHorizontal(binary[0]);
        printVertical(binary[5],binary[1]);
        printHorizontal(binary[6]);
        printVertical(binary[4],binary[2]);
        printHorizontal(binary[3]);



    }
    private static void printHorizontal(boolean condition){
        if (condition) System.out.println(" # # # #");
    }
    private static void printVertical(boolean condition1 , boolean condition2){
        if(condition1 && condition2)for(int count = 0; count<4;count++) System.out.println("#       #");

        if(condition1 && !condition2)for(int count = 0; count<4;count++) System.out.println("#       ");

        if(!condition1 && condition2)for(int count = 0; count<4;count++) System.out.println("       #");
    }
    private static void displaySegments(boolean[] array){
        int length = array.length;
        for(int count = 0;count<length/2+1;count++){
            if(count%2==0) printHorizontal(array[0]);
        }

    }

    public static void main(String[] args) {
        displaySevenSegmentDisplay("0110011");
    }
}
