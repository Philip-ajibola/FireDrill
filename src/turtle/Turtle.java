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
        return currentDirection;
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnleft();
    }
}
