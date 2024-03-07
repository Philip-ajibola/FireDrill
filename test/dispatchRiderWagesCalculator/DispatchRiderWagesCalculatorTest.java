package dispatchRiderWagesCalculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispatchRiderWagesCalculatorTest {


    @Test
    public void testThatWhenNumberOfDeliveryIsLessThan50_NumberOfDeliveryIsMultipliedBy160AndAddedToBaseSalary(){
            int expectedSalary = DispatchRiderWagesCalculator.calculateRidersWages(25);
            assertEquals(9_000,expectedSalary);
    }

    @Test
    public void testThatWhenNumberOfDeliveryIsAtTheRangeOf50_59_NumberOfDeliveryIsMultipliedBy200AndAddedToBaseSalary(){
        int expectedSalary = DispatchRiderWagesCalculator.calculateRidersWages(57);
        assertEquals(16_400,expectedSalary);
    }

    @Test
    public void testThatWhenNumberOfDeliveryIsAtTheRangeOf60_69_NumberOfDeliveryIsMultipliedBy200AndAddedToBaseSalary(){
        int expectedSalary = DispatchRiderWagesCalculator.calculateRidersWages(68);
        assertEquals(22_000,expectedSalary);
    }
    @Test
    public void testThatWhenNumberOfDeliveryIsGreaterThan_NumberOfDeliveryIsMultipliedBy200AndAddedToBaseSalary(){
        int expectedSalary = DispatchRiderWagesCalculator.calculateRidersWages(80);
        assertEquals(45_000,expectedSalary);
    }



}