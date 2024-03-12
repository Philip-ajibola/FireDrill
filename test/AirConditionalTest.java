import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionalTest {
    private AirConditioner airConditioner;

    @BeforeEach
    public void initializeAc() {
        airConditioner = new AirConditioner();
    }

    @Test
    public void turnOnAc_acIsOnTest() {
        assertFalse(airConditioner.isOn());

        airConditioner.toggle();
        assertTrue(airConditioner.isOn());
    }

    @Test
    public void turnOffAc_acIsOffTest() {
        assertFalse(airConditioner.isOn());
        airConditioner.toggle();
        assertTrue(airConditioner.isOn());

        airConditioner.toggle();
        assertFalse(airConditioner.isOn());
    }

    @Test
    public void increaseAcTemperatureFrom16To17_temperatureIncreasesTest() {
        airConditioner.toggle();
        assertTrue(airConditioner.isOn());
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }

    @Test
    public void decreaseAcTemperatureFrom18To17_temperatureDecreasesTest() {
        airConditioner.toggle();
        assertTrue(airConditioner.isOn());
        airConditioner.increaseTemperature();
        airConditioner.increaseTemperature();
        assertEquals(18, airConditioner.getTemperature());


        airConditioner.decreaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }

    @Test
    public void increaseAcTemperatureAt30_temperatureIs30Test() {
        airConditioner.toggle();
        assertTrue(airConditioner.isOn());
        assertEquals(16, airConditioner.getTemperature());

        for (int count = 0; count < 14; count++) airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());

        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void decreaseAcTemperatureAt16_temperatureIs16Test() {
        airConditioner.toggle();
        assertTrue(airConditioner.isOn());
        assertEquals(16, airConditioner.getTemperature());

        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }

}