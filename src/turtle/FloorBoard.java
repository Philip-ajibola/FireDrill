package turtle;

import java.util.Arrays;

public class FloorBoard {
    private final int[][] BOARD = new int[20][20];
    private int horizontalPosition = 0;
    private int verticalPosition = 0;
    //private int[] position;

    public void move(int lengthOfMovement,Direction direction) {
        switch (direction) {
            case EAST ->{
                for (int count = 0; count < lengthOfMovement; count++) {
                    BOARD[verticalPosition][horizontalPosition++] = 1;
                }
            }
            case SOUTH ->{
                for (int count = 0; count < lengthOfMovement; count++) {
                BOARD[verticalPosition++][horizontalPosition-1] = 1;
            }
            }
            case WEST -> {
                for (int count = 0; count < lengthOfMovement; count++) {
                    BOARD[verticalPosition-1][--horizontalPosition] = 1;
                }
            }
            case NORTH -> {
                for (int count = 0; count < lengthOfMovement; count++) {
                    BOARD[--verticalPosition][horizontalPosition] = 1;
                }
            }
        }
    }

    public int[] getPosition(){
        return  new int[]{verticalPosition,horizontalPosition};
    }
    public void displayBoard(){
        for(int[] movement: BOARD){
            System.out.println(Arrays.toString(movement));
        }
    }
}
