package turtle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    @Test
    void testThatPenIsUp(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void testThatPenIsDown(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }


}