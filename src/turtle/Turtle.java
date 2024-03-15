package turtle;

import java.util.Scanner;

import static turtle.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private Direction currentDirection = EAST;
    private FloorBoard floorBoard = new FloorBoard();
    private int[] position = new int[2];

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
        floorBoard.move(lengthOfMovement, currentDirection, position, penIsUp);
        setPosition(floorBoard.getPosition());
    }

    public int[] getTurtlePosition() {
        return position;
    }

    public void setPosition(int[] array) {
        this.position = array;
    }

    public int[][] getBoard() {
        return floorBoard.getBoard();
    }
    public FloorBoard getFloorBoard(){
        return floorBoard;
    }

}
