import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Condition;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionalTest {
    @Test
    public  void testIfAirConditionalClassExist() {
        AirConditional airConditional = new AirConditional();
        assertNotNull(airConditional);
    }
    @Test
   public  void isTurnOn() {
        AirConditional airConditional = new AirConditional();
        boolean condition = airConditional.isOn();
        assertFalse(condition);
        airConditional.OnAirCondition();
        boolean condition1 = airConditional.isOn();
        assertTrue(condition1);
    }

    @Test
    public void isTurnOff(){
        AirConditional airConditional = new AirConditional();
        boolean condition = airConditional.isTurnOff();
        assertFalse(condition);
        airConditional.OffAirConditional();
        condition = airConditional.isTurnOff();
    }
}