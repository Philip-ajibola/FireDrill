package turtle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

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
        assertSame(EAST,turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhileFacingNorth(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST,turtle.getCurrentDirection());
    }


}