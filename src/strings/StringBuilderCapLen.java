package strings;

import javax.crypto.spec.PSource;

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you doing ?");
        System.out.printf(" buffer: %s%nlength = %d%ncapacity = %d%n",buffer.toString(),buffer.length(),buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.println("buffer new Capacity: " + buffer.capacity());
        buffer.setLength(10);
        System.out.printf("buffer new length: %d%n buffer now:  %s %n", buffer.length(),buffer.toString());
        buffer.reverse();
        System.out.println("buffer when reversed : " + buffer.toString());
        buffer.setCharAt(5,'O');
        buffer.setCharAt(9,'H');
        System.out.println("new buffer" + buffer.toString());
        buffer.append(System.getProperty("line.separator"));
        int number = 15;
        int number1 = 17;
        buffer.append(number);
        buffer.append(System.getProperty("line.separator"));
        buffer.append(number1);
        System.out.println(buffer.toString());

        // concatenation
        String concatenatedValue = new StringBuilder().append("abc").append(345).toString();
        System.out.println(concatenatedValue);
    }

}
