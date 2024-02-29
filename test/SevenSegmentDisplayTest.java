import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {

    @Test
    void testThatWhenTheLengthOfTheLengthOfTheBinaryIsGreaterThanOrLessThan8_ErrorIsThrown() {
        //SevenSegmentDisplay.displaySevenSegmentDisplay("111111111");
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

}