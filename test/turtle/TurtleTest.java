package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

class TurtleTest {
    private Turtle turtle;
    @BeforeEach
    public void createTurtle(){
        turtle = new Turtle();
    }
    @Test
    void testThatPenIsUp(){
        assertTrue(turtle.isPenUp());
    }
    @Test
    void testThatPenIsDown(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void testThatCanBePutUpWhenPenIsPutDown(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void testThatTurtleCanTurnLeftWhileFacingEast(){
        turtle.turnLeft();
        assertSame(NORTH,turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhileFacingNorth(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST,turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhileFacingWest(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH,turtle.getCurrentDirection());
    }
    @Test
    void testThatTurtleCanTurnLeftWhileFacingSouth(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(EAST,turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRightWhileFacingEast(){
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRightWhileFacingSouth(){
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRightWhileFacingWest(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH,turtle.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRightWhileFacingNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(EAST,turtle.getCurrentDirection());
    }



}