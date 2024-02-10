import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
class FireDrillThreeTest {

    @Test
    void taskOneTest() {
        FireDrillThree fireDrill = new FireDrillThree();

        double[] number = fireDrill.taskOne(1.1,2.2,5.6,7.8,5.5,6.0,7.8,9.8,9.9,10.8);
        double[] expected ={1.1,2.2,5.6,7.8,5.5,6.0,7.8,9.8,9.9,10.8};
        assertArrayEquals(expected,number);
    }

    @Test
    public void taskTwoTest(){
        FireDrillThree fireDrill = new FireDrillThree();
        String number = fireDrill.taskTwo(fireDrill.taskOne(1.1,2.2,5.6,7.8,5.5,6.0,7.8,9.8,9.9,10.8));
        String expected = """
                1.1
                2.2
                5.6
                7.8
                5.5
                6.0
                7.8
                9.8
                9.9
                10.8
                """;
        assertEquals(expected,number);

    }

    @Test
    public void taskThreeTest(){
        FireDrillThree fireDrill = new FireDrillThree();
        String number = fireDrill.taskThree(fireDrill.taskOne(1.1,2.2,5.6,7.8,5.5,6.0,7.8,9.8,9.9,10.8));
        String expected = "1.1 2.2 5.6 7.8 5.5 6.0 7.8 9.8 9.9 10.8 ";
        assertEquals(expected,number);

    }

    @Test
    public void taskFourWhenArrayLengthIsEvenTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {10,2,3,4,5,6,7,8};
        int[] returnedArray = firedriil.taskFour(array);
        int[] expected = {10,3,5,7};
        assertArrayEquals(expected,returnedArray);

    }
    @Test
    public void taskFourWhenArrayLengthIsOddTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {1,2,3,4,5,6,7};
        int[] returnedArray = firedriil.taskFour(array);
        int[] expected = {1,3,5,7};
        assertArrayEquals(expected,returnedArray);

    }

    @Test
    public void taskFiveWhenArrayLengthIsOddTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {1,2,3,4,5,6};
        int[] returnedArray = firedriil.taskFive(array);
        int[] expected = {2,4,6};
        assertArrayEquals(expected,returnedArray);

    }
    @Test
    public void taskFiveWhenArrayLengthIsEvenTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {1,2,3,4,5,6,7,8};
        int[] returnedArray = firedriil.taskFive(array);
        int[] expected = {2,4,6,8};
        assertArrayEquals(expected,returnedArray);

    }

    @Test
    public void taskSixTest(){
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {1,2,3,4,5,6};
        int returnedArray = firedriil.taskSix(array);
        assertEquals(9,returnedArray);


    }

    @Test
    public void taskSevenTest(){
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {1,2,3,4,5,6};
        int returnedArray = firedriil.taskSeven(array);
        assertEquals(12,returnedArray);


    }
    @Test
    public void taskEightPickMinimumFromTaskFourTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {10,2,3,4,5,6,7,8};
        int expected = firedriil.taskEight(array);
        assertEquals(3,expected);

    }
    @Test
    public void taskNinePickMinimumFromTaskFourTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {10,2,3,4,5,1,7,8};
        int expected = firedriil.taskNine(array);
        assertEquals(1,expected);

    }

    @Test
    public void taskTenPickMaximumFromTaskFourTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {10,2,3,4,5,1,7,8};
        int expected = firedriil.taskTen(array);
        assertEquals(10,expected);

    }

    @Test
    public void taskElevenPickMaximumFromTaskFiveTest() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {10,2,3,4,5,1,7,8};
        int expected = firedriil.taskEleven(array);
        assertEquals(8,expected);

    }

    @Test
    public void taskTwelveSwapArraysFromEvenIndexesToOddIndexes() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {1,2,3,4,5,6,7,8};
        int[] expected = {2,1,4,3,6,5,8,7};
        int[] actual = firedriil.taskTwelve(array);
        assertArrayEquals(expected,actual);

    }

    @Test
    public void taskThirteenSwapArraysFromEvenIndexesToOddIndexesIfAnyOfTheElementIsOdd() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {1,9,3,4,5,6,7};
        int[] expected = {9,1,3,4,5,6,7};
        int[] actual = firedriil.taskThirteen(array);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);

        int[] array2 = {1,9,3,4,5,6};
        int[] actual2 = firedriil.taskThirteen(array2);
        int[] expected2= {9,1,3,4,5,6};
        assertArrayEquals(expected2,actual2);


    }

    @Test
    public void taskFourteenSwapArraysFromEvenIndexesToOddIndexesIfAnyOfTheElementIsOdd() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {8,12,3,4,5,6,7};
        int[] expected = {12,8,3,4,5,6,7};
        int[] actual = firedriil.taskFourteen(array);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);

        int[] array2 = {8,12,3,4,5,6};
        int[] expected2 = {12,8,3,4,5,6};
        int[] actual2 = firedriil.taskFourteen(array2);
        assertArrayEquals(expected2,actual2);


    }

    @Test
    public void taskFifteenSwapArraysFromEvenIndexesToOddIndexesIfAnyOfTheElementIsOdd() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {8,12,9,3,5,6,7};
        int[] expected = {12,8,9,3,6,5,7};
        int[] actual = firedriil.taskFifteen(array);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);


        int[] array2 = {8,12,9,3,5,6};
        int[] expected2 = {12,8,9,3,6,5};
        int[] actual2 = firedriil.taskFifteen(array2);
        assertArrayEquals(expected2,actual2);
    }

    @Test
    public void taskSixteenSwapArraysFromEvenIndexesToOddIndexesIfAnyOfTheElementIsOdd() {
        FireDrillThree firedriil = new FireDrillThree();
        int[] array = {8,12,9,3,5,6,7};
        int[] expected = {8,12,3,9,6,5,7};
        int[] actual = firedriil.taskSixteen(array);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);

        int[] array2 = {8,12,9,3,5,6};
        int[] expected2 = {8,12,3,9,6,5};
        int[] actual2 = firedriil.taskSixteen(array2);
        assertArrayEquals(expected2,actual2);


    }







}