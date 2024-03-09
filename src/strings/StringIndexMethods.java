package strings;

public class StringIndexMethods {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        System.out.printf("'c' is located at index %d%n",letters.indexOf('c'));
        System.out.printf("'c' is located at index %d%n",letters.indexOf('a',1));
        System.out.printf("'c' is located at index %d%n",letters.indexOf('$'));

        System.out.printf("last c appears at index %d",letters.lastIndexOf("c"));
        System.out.printf("last c appears at index %d",letters.lastIndexOf("a",25));
        System.out.printf("last c appears at index %d",letters.lastIndexOf("$"));

        System.out.printf("\"def\" is located at index %d",letters.lastIndexOf("def"));
        System.out.printf("\"def\" is located at index %d",letters.lastIndexOf("def",7));
    }
}
