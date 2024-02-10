import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireDrillFiveTest {

    @Test
    void testThatFunctionReturnTheDoubleLengthOfArray() {
        FireDrillFive fireDrill = new FireDrillFive();
        int[] array = {4,5,8};
       int[] result =  fireDrill.returnDoubleLengthOfArray(array);
       int[] expected = {4,5,8,8,10,16};
       assertArrayEquals(expected,result);

    }
    @Test
    void testThatFunctionReturnTheDoubleLengthOfArrayForNegative() {
        FireDrillFive fireDrill = new FireDrillFive();
        int[] array = {4,-5,-8};
        int[] result =  fireDrill.returnDoubleLengthOfArray(array);
        int[] expected = {4,-5,-8,8,-10,-16};
        assertArrayEquals(expected,result);

    }

}