package dispatchRiderWagesCalculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispatchRiderWagesCalculatorTest {


    @Test
    public void testThatWhenNumberOfDeliveryIsLessThan50_NumberOfDeliveryIsMultipliedBy160AndAddedToBaseSalary(){
            int expectedSalary = DispatchRiderWagesCalculator.calculateRidersWages(25);
            assertEquals(9000,expectedSalary);
    }

    @Test
    public void testThatWhenNumberOfDeliveryIsAtTheRangeOf50_59_NumberOfDeliveryIsMultipliedBy160AndAddedToBaseSalary(){
        int expectedSalary = DispatchRiderWagesCalculator.calculateRidersWages(25);
        assertEquals(9000,expectedSalary);
    }


}