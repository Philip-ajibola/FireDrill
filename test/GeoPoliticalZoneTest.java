import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneTest {
    @Test
    public void testThatICanLengthOfArrayOfTypeGeoPoliticalZone(){
        GeoPoliticalZone[] zones = GeoPoliticalZone.values();
        assertEquals(6,zones.length);

    }
    @Test
    public void testThatICanGeoPoliticalZoneOfAState(){
       // GeoPoliticalZone zone = GeoPoliticalZone.NORTH_WEST;
        String[] state = {"Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"};
        assertArrayEquals(state,GeoPoliticalZone.NORTH_CENTRAL.getStates());
    }
    @Test
    public void testThatMethodCheckIfStateIsInThePoliticalZone(){
        String state = "Benue";
        GeoPoliticalZone zone = GeoPoliticalZone.NORTH_CENTRAL;
        assertEquals(zone,GeoPoliticalZone.getStateInPoliticalZone(state));
    }
    @Test
    public void testThatAPoliticalZoneContainAState(){
        GeoPoliticalZone states = GeoPoliticalZone.NORTH_CENTRAL;
        String state = "FCT";
        assertTrue(states.contain(state));
    }


}