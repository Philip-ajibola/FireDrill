package dispatchRiderWagesCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DispatchRiderWagesCalculatorTest {
    private DispatchRiderWagesCalculator riderWagesCalculator;

    @BeforeEach
    public void createCalculator(){
        riderWagesCalculator = new DispatchRiderWagesCalculator();
    }
    @Test
    public void testThatWhenNumberOfDeliveryIsNotOfTo50_NumberOfDeliveryIsMultipliedBy160AndAddedToBaseSalary(){

    }

}