package turtle;

import static turtle.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private  Direction currentDirection = EAST;
    private  FloorBoard floorBoard = new FloorBoard();

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
        currentDirection = currentDirection.turnLeft();
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

    public void move(int lengthOfMovement) {
        floorBoard.move(lengthOfMovement,currentDirection);
        floorBoard.displayBoard();
    }

    public int[] getTurtlePosition() {
        return floorBoard.getPosition();
    }
}
