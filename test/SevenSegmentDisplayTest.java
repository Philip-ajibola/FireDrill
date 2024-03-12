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
            expectedSegment +="       #\n";
        }
        expectedSegment +=" # # # #\n";
        for(int count = 0; count<4;count++) {
            expectedSegment +="#       \n";
        }
        expectedSegment += " # # # #\n";
        assertEquals(expectedSegment,SevenSegmentDisplay.displaySevenSegmentDisplay("00001101"));
    }

}