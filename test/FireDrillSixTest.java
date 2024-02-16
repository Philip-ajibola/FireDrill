import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireDrillSixTest {
    @Test
    public void testThatFunctionReturnsAnArray(){
        FireDrillSix fireDrill = new FireDrillSix();
        int[] array = new int[5];
        int[] result = fireDrill.returnAnArrayOfElementConsistingZeroAndOnes(array);
        assertArrayEquals(result,array);
    }
    @Test
    public void testThatFunctionCheckElementInAnArrayIfTheElementIsEvenItReplaceItWithZeroElseReplaceWithOne(){
        FireDrillSix fireDrill = new FireDrillSix();
        int[] array = {4,5,8,8,8,2,9};
        int[] result = {0,1,0,0,0,0,1};
        assertArrayEquals(result,fireDrill.returnAnArrayOfElementConsistingZeroAndOnes(array));
    }
    @Test
    public void testThatFunctionCheckElementInAnArrayIfTheElementIsEvenItReplaceItWithFalseElseReplaceWithTrue(){
        FireDrillSix fireDrill = new FireDrillSix();
        int[] array = {4,5,8,8,8,2,9};
        boolean[] result = {false,true,false,false,false,false,true};
        assertArrayEquals(result,fireDrill.returnAnArrayOfElementConsistingFalseAndTrue(array));
    }
@Test
    public void TestThatArrayHaveZero(){
    FireDrillSix fireDrill = new FireDrillSix();
    int[] array = new int[10];
    int[] result = {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(result,fireDrill.getArrayELement(array));
}



}