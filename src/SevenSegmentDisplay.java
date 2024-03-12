import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput ="";
        boolean condition = true;
        while (condition) {
            try {
                System.out.println("Enter Binary Number To Print The Seven Segment Display");
                userInput = input.next();
                System.out.println(displaySevenSegmentDisplay(userInput));
                condition = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.next();
            }
        }
    }
    public static String displaySevenSegmentDisplay(String binaryInput){
        verifyLength(binaryInput);
        verifyInput(binaryInput);
        if(verifyTheLastCharIsOne(binaryInput.charAt(7))){
        boolean[] binary = changeStringToBoolean(binaryInput);
        return displaySegment(binary);}
        return "";
    }
    private static String printHorizontal(boolean condition){
        if (condition) return " # # # #\n";
        return "";
    }
    private static String printVertical(boolean condition1 , boolean condition2){
        String expectedSegment = "";
        if(condition1 && condition2)for(int count = 0; count<4;count++){
            expectedSegment +="#       #\n";

        }

        if(condition1 && !condition2)for(int count = 0; count<4;count++) {
            expectedSegment +="#       \n";
        }

        if(!condition1 && condition2)for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        return expectedSegment;
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
    private static String displaySegment(boolean[] binary){
        String segment ="";
        segment += printHorizontal(binary[0]);
        segment += printVertical(binary[5],binary[1]);
        segment+=printHorizontal(binary[6]);
        segment += printVertical(binary[4],binary[2]);
        segment+=printHorizontal(binary[3]);
        return segment;
    }
}
