package turtle;

import static turtle.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private  Direction currentDirection = EAST;
    private int[] position  = new int[2];

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

    public void move(int lengthOfMovement,FloorBoard floorBoard) {
        floorBoard.move(lengthOfMovement,currentDirection,position);
        setPosition(floorBoard.getPosition());
        floorBoard.displayBoard();
    }

    public int[] getTurtlePosition() {
        return position;
    }
    public void setPosition(int[] array){
        this.position = array;
    }

}
