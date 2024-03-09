package strings;

public class StringIndexMethods {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        System.out.printf("'c' is located at index %d%n",letters.indexOf('c'));
        System.out.printf("'a' is located at index %d%n",letters.indexOf('a',1));
        System.out.printf("'$' is located at index %d%n",letters.indexOf('$'));

        System.out.printf("\nlast c appears at index %d\n",letters.lastIndexOf("c"));
        System.out.printf("last a appears at index %d\n",letters.lastIndexOf("a",25));
        System.out.printf("last $ appears at index %d\n",letters.lastIndexOf("$"));

        System.out.printf("\n\"def\" is located at index %d\n",letters.lastIndexOf("def"));
        System.out.printf("\"def\" is located at index %d\n",letters.lastIndexOf("def",7));
        System.out.printf("\"def\" is located at index %d\n",letters.lastIndexOf("def",25));
    }
}
