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
    @Test
    void testThatCanBePutUpWhenPenIsPutDown(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void testThatTurtleCanTurnLeftWhileFacingEast(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertSame(Direction.EAST,turtle.getCurrentDirection());
    }


}