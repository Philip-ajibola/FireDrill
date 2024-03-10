package strings;

import java.util.Arrays;

public class StringMiscellaneous2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GGODBYE";
        String s3  = "   space   ";
        System.out.println("replace 'l' with 'L' \n s1 : " + s1.replace("l","L"));
        System.out.println("s3 use trim to remove the space\n s3 after trim : " + s3.trim());

        char[] charArray = s1.toCharArray();
        System.out.println("s1 convert to an array " + Arrays.toString(charArray));
    }
}
