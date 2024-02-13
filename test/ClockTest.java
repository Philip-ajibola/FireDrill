import PersonalTask.MyClock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    private MyClock clock = new MyClock();

    @BeforeEach
    public void initializeMyClock(){
        clock = new MyClock();
    }
    @Test
    public void testThatFunctionRejectAlphabetAndUnnecessaryCharacter(){
                assertThrows(IllegalArgumentException.class,()->clock.validateUserInput('-'));
    }

    @Test
    public void testThatClockCanGiveTimeInWords(){
        //clock.checkUserInput("12-00");
        assertThrows(IllegalArgumentException.class,()->clock.checkUserInput("12-00"));

    }
    @Test
    public void testThatHourIsSet(){
        clock.setHour(23);
        assertEquals(23,clock.getHour());
    }
    @Test
    public void testThatWhenHourIsInValid(){
        assertThrows(IllegalArgumentException.class,()->clock.setHour(25));
    }
    @Test
    public void testThatMinuteIsSet(){
        clock.setMinute(23);
        assertEquals(23,clock.getMinute());
    }
    @Test
    public void testThatWhenMinuteIsInValid(){
        assertThrows(IllegalArgumentException.class,()->clock.setMinute(60));
    }
    @Test
    public void testThatMethodTakeTheFirstTwoCharInUserInputAndConvertToInt(){
        assertEquals(23,clock.takeTheFirstTwoCharInUserInputAndConvertToInt("23"));
    }

    @Test
    public void testThatMethodTakeTheLastTwoCharInUserInputAndConvertToInt(){
        assertEquals(23,clock.takeTheFirstTwoCharInUserInputAndConvertToInt("23"));
    }

    @Test
    public void testThatMethodReturnMinutesInWords(){
        assertEquals("TwentyThree",clock.returnMinutesInWord(23));
    }
    @Test
    public void testThatMethodReturnHourInWords(){
        assertEquals("Eleven",clock.returnHourInWord(23));
    }
    @Test
    public void testMethodCheckMinute(){
        assertEquals("Nineteen",clock.checkMinute(19));
    }
    @Test
    public void testMethodCheckMinuteIsGraterThanTwenty(){
        assertEquals("ThirtyNine",clock. checkMinuteIsGraterThanTwenty(39));
    }
    @Test
    public void testMethodCheckSpecificTimeOfTheDay(){
        assertTrue(clock.checkSpecificTimeOfTheDay(13));
        assertFalse(clock.checkSpecificTimeOfTheDay(2));
    }

    @Test
    public void testMethodThatReturnSpecifyTimeForAM(){
        clock.setHour(6);
        assertEquals(MyClock.SpecificTimeOfTheDay.AM,clock.returnSpecifyTime());
    }

    @Test
    public void testMethodThatReturnSpecifyTimeForPM(){
        clock.setHour(16);
        assertEquals(MyClock.SpecificTimeOfTheDay.PM,clock.returnSpecifyTime());
    }
    @Test
    public void testMethodReturnTimeInWords(){
        clock.checkUserInput("12:56");
        assertEquals("Twelve--FiftySix (PM)",clock.returnTimeInWords());
    }

    @Test
    public void testMethodReturnTimeInWordsTwo(){
        clock.checkUserInput("12:00");
        assertEquals("Twelve--O'Clock (PM)",clock.returnTimeInWords());
    }

    @Test
    public void testMethodReturnTimeInWordsThree(){
        clock.checkUserInput("00:00");
        assertEquals("Twelve--O'Clock (AM)",clock.returnTimeInWords());
    }






}
