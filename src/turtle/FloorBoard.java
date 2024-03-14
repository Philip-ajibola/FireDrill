package turtle;

import java.util.Arrays;

public class FloorBoard {
    private final int[][] BOARD = new int[20][20];
    private int horizontalPosition = 0;
    private int verticalPosition = 0;
    //private int[] position;

    public void move(int lengthOfMovement,Direction direction,int[] array) {
                            horizontalPosition = array[1];
                            verticalPosition = array[0];
        switch (direction) {
            case EAST ->{
                        int count = 0;
                    for (; count < lengthOfMovement;count++){
                        if(count>0)horizontalPosition++;
                        BOARD[verticalPosition][horizontalPosition] = 1;
                    }
            }
            case SOUTH ->{
                int count = 0;
                for (; count < lengthOfMovement ; count++){
                    if(count>0)verticalPosition++;
                    BOARD[verticalPosition][horizontalPosition] = 1;
                }
            }
            case WEST -> {
                for (int count = lengthOfMovement; count > 0 ; count--){
                    if(count < lengthOfMovement)horizontalPosition--;
                    BOARD[verticalPosition][horizontalPosition] = 1;
                }
            }
            case NORTH -> {
                    for (int count = lengthOfMovement; count > 0; count--){
                        if(count<lengthOfMovement)verticalPosition--;
                        BOARD[verticalPosition][horizontalPosition] = 1;
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
