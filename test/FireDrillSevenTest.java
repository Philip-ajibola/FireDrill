import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FireDrillSevenTest {

    @Test
    public void testThatWhenUserInputDateOfBirthFUnctionReturnYear() {
        assertEquals(1,FireDrillSeven.getAge("12/12/2022"));
    }
    @Test
    public void testThatWhenUserInputCurrentYearAndTheMonthAndTheDateAreSameYearShouldBeZero() {
        assertEquals(0,FireDrillSeven.getAge("12/1/2024"));
    }

    @Test
    public void testThatFunctionConvertStringArrayToIntArray() {
        String[] array={"22","12","2022"};
        int[] expectedArray ={22,12,2022};
        assertArrayEquals(expectedArray,FireDrillSeven.convertStringArrayToIntArray(array));
    }

    @Test
    public void testThatFunctionCanCalculateYear() {
        int[] array = {22,12,2022};
        assertEquals(1,FireDrillSeven.calculateYear(array));
    }
}