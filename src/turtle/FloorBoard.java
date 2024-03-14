package turtle;

public class FloorBoard {
    private final int[][] BOARD = new int[20][20];
    private int horizontalPosition = 1;
    private int verticalPosition = 1;
    //private int[] position;

    public void move(int lengthOfMovement,Direction direction) {
        if(direction == Direction.EAST) {
            int count = 0;
            for(; count<lengthOfMovement;count++){
                BOARD[horizontalPosition][count] = 1;
            }
            horizontalPosition = count;
        }
    }

    public int[] getPosition(){
        return  new int[]{verticalPosition,horizontalPosition};
    }
}
