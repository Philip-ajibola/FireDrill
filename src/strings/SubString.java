package strings;

public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        System.out.println("sub string from index 20 to end is " + letters.substring(20));
        System.out.println();
        System.out.println("sub string from index 3 up to, but not up to index 6  is " + letters.substring(3,6));
    }
}
