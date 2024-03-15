package turtle;

public class FloorBoard {
    private static final int[][] BOARD = new int[20][20];
    private int horizontalPosition = 0;
    private int verticalPosition = 0;
    public FloorBoard(){
        setBoardDefaultValue();
    }

    public void move(int lengthOfMovement,Direction direction,int[] array,boolean penIsUp) {
        validateLength(lengthOfMovement);
        horizontalPosition = array[1];
        verticalPosition = array[0];
        switch (direction) {
            case EAST ->{
                    for (int count = 0; count < lengthOfMovement;count++) {
                        if (count > 0) horizontalPosition++;
                        if(penIsUp) BOARD[verticalPosition][horizontalPosition] = 0;
                        if(!penIsUp) BOARD[verticalPosition][horizontalPosition] = 1;
                    }
            }
            case SOUTH ->{
                int count = 0;
                for (; count < lengthOfMovement ; count++){
                    if(count>0)verticalPosition++;
                    if(penIsUp)BOARD[verticalPosition][horizontalPosition] = 0;
                    if(!penIsUp)BOARD[verticalPosition][horizontalPosition] = 1;
                }
            }
            case WEST -> {
                for (int count = lengthOfMovement; count > 0 ; count--){
                    if(count < lengthOfMovement)horizontalPosition--;
                    if(penIsUp)BOARD[verticalPosition][horizontalPosition] = 0;
                    if(!penIsUp)BOARD[verticalPosition][horizontalPosition] = 1;
                }
            }
            case NORTH -> {
                    for (int count = lengthOfMovement; count > 0; count--){
                        if(count<lengthOfMovement)verticalPosition--;
                        if(penIsUp)BOARD[verticalPosition][horizontalPosition] = 0;
                        if(!penIsUp)BOARD[verticalPosition][horizontalPosition] = 1;
                    }
            }
        }
    }
    public int[] getPosition(){
        return  new int[]{verticalPosition,horizontalPosition};
    }
    public void displayMoves(){
        for(int[] movement: BOARD){
            for(int count = 0 ; count<movement.length;count++){
                if (movement[count] == 1) {
                    if(count<movement.length-2) {
                        System.out.print("* ");
                    }else System.out.print("*");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public void validateLength(int lengthOfMovement){
        if(lengthOfMovement <= 0) throw new IllegalArgumentException("Invalid Turtle Move ");
    }
    private  static void setBoardDefaultValue(){
        for(int count =0; count<BOARD.length;count++){
            for(int counter = 0; counter<BOARD[0].length;counter++){
                BOARD[count][counter] = -1;
            }
        }
    }
    public int[][] getBoard(){
        return BOARD;
    }


}
