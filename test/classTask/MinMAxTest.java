package classTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMAxTest {
    @Test
    void testThatMethodReturnMinimumAndMAxiMumValueOfAnArray(){
        int[] array = {3,4,2,5,1};
        int[] expectedArray = {10,14};
        assertArrayEquals(expectedArray,MinMAx.getMinMaxOf(array));
    }
}