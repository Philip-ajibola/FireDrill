public class SevenSegmentDisplay {
    public static void displaySevenSegmentDisplay(String binaryInput){
        verifyLength(binaryInput);
        verifyInput(binaryInput);
        if(verifyTheLastCharIsOne(binaryInput.charAt(7))){
        boolean[] binary = changeStringToBoolean(binaryInput);
        displaySegment(binary);}
    }
    private static void printHorizontal(boolean condition){
        if (condition) System.out.println(" # # # #");
    }
    private static void printVertical(boolean condition1 , boolean condition2){
        if(condition1 && condition2)for(int count = 0; count<4;count++) System.out.println("#       #");

        if(condition1 && !condition2)for(int count = 0; count<4;count++) System.out.println("#       ");

        if(!condition1 && condition2)for(int count = 0; count<4;count++) System.out.println("       #");
    }
    private static void verifyInput(String input){
        for(int count = 0;count<input.length();count++)
            if(input.charAt(count)!='0' && input.charAt(count) !='1') throw new IllegalArgumentException("Binary Value Expected 0 and 1");
    }
    private static void verifyLength(String input){
        if(input.length() != 8)throw new IllegalArgumentException("Invalid Input, Enter The Right Binary ");
    }
    private static boolean[] changeStringToBoolean(String input){
        boolean[] binary = new boolean[7];
        for(int count = 0;count< binary.length;count++) if (input.charAt(count) == '1') binary[count] = true;
        return binary;
    }
    public static boolean verifyTheLastCharIsOne(char lastChar){
        return lastChar == '1';
    }

    public static void main(String[] args) {
        displaySevenSegmentDisplay("01100111");
    }
    private static void displaySegment(boolean[] binary){
        printHorizontal(binary[0]);
        printVertical(binary[5],binary[1]);
        printHorizontal(binary[6]);
        printVertical(binary[4],binary[2]);
        printHorizontal(binary[3]);
    }
}
