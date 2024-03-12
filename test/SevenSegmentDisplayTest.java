import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {

    @Test
    void testThatWhenTheLengthOfTheLengthOfTheBinaryIsGreaterThanOrLessThan8_ErrorIsThrown() {
        assertThrows(IllegalArgumentException.class,()->SevenSegmentDisplay.displaySevenSegmentDisplay("111111111"));

    }
    @Test
    void testThatAllTheCharacterAreEitherOneORZeroIFNot_ifNotThrowException(){
        assertThrows(IllegalArgumentException.class,()->SevenSegmentDisplay.displaySevenSegmentDisplay("11111311"));
    }

    @Test
    void testThatWhenAlphabetIsPartOfTheInput_ExceptionIsThrown(){
        assertThrows(IllegalArgumentException.class,()->SevenSegmentDisplay.displaySevenSegmentDisplay("11111ab1"));
    }
    @Test
    void testThat1CanBeDisplayed(){
        String expectedSegment = "";
        for(int count = 0; count<8;count++) {
            expectedSegment +="#       \n";
        }
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("00001101"));
    }
    @Test
    void testThat2CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        expectedSegment +=" # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       \n";
        }
        expectedSegment += " # # # #\n";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("11011011"));
    }
    @Test
    void testThat3CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        expectedSegment +=" # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        expectedSegment += " # # # #\n";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("11110011"));
    }
    @Test
    void testThat4CanBeDisplayed(){
        String expectedSegment = "";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       #\n";
        }
        expectedSegment +=" # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("01100111"));
    }
    @Test
    void testThat5CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       \n";
        }
        expectedSegment +=" # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        expectedSegment +=" # # # #\n";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("10110111"));
    }
    @Test
    void testThat6CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       \n";
        }
        expectedSegment +=" # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       #\n";
        }
        expectedSegment +=" # # # #\n";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("10111111"));
    }
    @Test
    void testThat7CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("11100001"));
    }
    @Test
    void testThat8CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       #\n";
        }
        expectedSegment += " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       #\n";
        }
         expectedSegment += " # # # #\n";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("11111111"));
    }
    @Test
    void testThat9CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       #\n";
        }
        expectedSegment += " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="        #\n";
        }
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("11100111"));
    }
    @Test
    void testThat0CanBeDisplayed(){
        String expectedSegment = " # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       #\n";
        }
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       #\n";
        }
        expectedSegment += " # # # #\n";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("11111101"));
    }
    @Test
    void testThatWhenLastBinaryIs0NothingIsDisplayed(){
        String expectedSegment = "";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("11111110"));
    }




}