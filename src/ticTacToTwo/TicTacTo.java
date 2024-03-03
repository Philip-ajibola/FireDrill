package ticTacToTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TicTacTo {
    private final Player[] PLAYERS = new Player[2];
    private final Value[][] BOARD = new Value[3][3];
    private  Set<Integer> set ;

    public TicTacTo(){
        Player player1 = new Player(1, Value.X);
        Player player2 = new Player(2,Value.O);
        set = new HashSet<>();
        PLAYERS[0] = player1;
        PLAYERS[1] = player2;
        fillBoard();
    }
    public Player[] getPlayers() {return PLAYERS;}
    public Value[][] getBoard() {return BOARD;}
    private void fillBoard(){for(Value[] value: BOARD) Arrays.fill(value,Value.EMPTY);}
    public void pickPosition(int position,Value value) {
        validatePlayerInput(position);
        boolean condition = set.add(position);
        if(!condition)throw new IllegalArgumentException("Space is already filled");
        checkInputThatFitInForRow1(position,value);
        checkInputThatFitInForRow2(position,value);
        checkInputThatFitInForRow3(position,value);
    }
    private void checkInputThatFitInForRow1(int input, Value type){
        if(input >0 && input<=3){
            if(input ==1) BOARD[0][0] = type;
            else if(input == 2) BOARD[0][1] = type;
            else BOARD[0][2] = type;
        }
    }
    private void checkInputThatFitInForRow2(int input, Value type){
        if(input >3 && input<=6){
            if(input ==4) BOARD[1][0] = type;
            else if(input == 5) BOARD[1][1] = type;
            else BOARD[1][2] = type;
        }
    }
    private void checkInputThatFitInForRow3(int input, Value type){
        if(input >6 && input<=9){
            if(input ==7) BOARD[2][0] = type;
            else if(input == 8) BOARD[2][1] = type;
            else BOARD[2][2] = type;
        }
    }
    private void validatePlayerInput(int input){
        if(input >9) throw new IllegalArgumentException("Range Out Of Band\n Range Is Between 1 - 9");
    }
}
