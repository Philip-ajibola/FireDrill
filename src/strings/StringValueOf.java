package strings;

public class StringValueOf {
    public static void main(String[] args) {
        char[] charArray = {'a','b','c','d','e','f'};
        boolean booleanValue = true;
        char characterValue  = 'z';
        long longValue = 1000000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        Object objectRef = "hello";
        System.out.println(" value of char array is: " + String.valueOf(charArray));
        System.out.println(" value of part of charArray is: " + String.valueOf(charArray,3,3));
        System.out.println(" value of longValue is: " + String.valueOf(longValue));
        System.out.println(" value of characterValue is: " + String.valueOf(characterValue));
        System.out.println(" value of boolean value is : " + String.valueOf(booleanValue));
        System.out.println(" value of objectValue  is: " + String.valueOf(objectRef));
        System.out.println(" value of doubleValue is: " + String.valueOf(doubleValue));

    }
}
