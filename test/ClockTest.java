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

    }

    @Test
    public void testThatClockCanGiveTimeInWords(){
        clock.checkTimeInWords("12:00");
        assertEquals("Twelve O'Clock",clock.returnTimeInWords());

    }

}
