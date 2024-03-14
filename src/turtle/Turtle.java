package turtle;

import static turtle.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private  Direction currentDirection = EAST;

    public boolean isPenUp() {
        return penIsUp;
    }

    public void penDown() {
        penIsUp = false;
    }

    public void penUp() {
        penIsUp = true;
    }

    public Direction getCurrentDirection() {
        return Direction.EAST;
    }

    public void turnLeft() {
        switch (currentDirection){
            case EAST -> currentDirection = NORTH;
            case NORTH -> currentDirection = WEST;
            case WEST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
        }
    }
}
