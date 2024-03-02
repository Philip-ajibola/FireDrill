package ticTacTo;

import java.util.Arrays;


public class TicTacTo {
    private final Value[][] BOARD = new Value[3][3];
    private Player[] players = new Player[2];
    public TicTacTo(){
        fillValuesWithEmpty();
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        players[0] = player1;
        players[1] = player2;
    }

    private void fillValuesWithEmpty() {
        for (Value[] value : BOARD) {
            Arrays.fill(value, Value.EMPTY);
        }
    }
    public void playGame(Player player,int number){

    }
    private void checkInputForPlayerOne(Player player, int playerInput){
        checkInputThatFitInForRow1(player, playerInput);
    }
    private void checkInputThatFitInForRow1(Player player,int input){
        if(input >0 && input<=3){
            if(input ==1) BOARD[0][0] = Value.X;
            else if(input == 2) BOARD[0][1] = Value.X;
            else BOARD[0][2] = Value.X;
        }
    }
    private void checkInputThatFitInForRow2(int input){
        if(input >3 && input<=6){
            if(input == 4) BOARD[1][0] = Value.X;
            else if(input == 5) BOARD[1][1] = Value.X;
            else BOARD[1][2] = Value.X;
        }
    }
    private void checkInputThatFitInForRow3(int input){
        if(input >6 && input<=9){
            if(input == 7) BOARD[2][0] = Value.X;
            else if(input == 8) BOARD[2][1] = Value.X;
            else BOARD[2][2] = Value.X;
        }
    }

    public Value[][] getBoard() {
        return BOARD;
    }
}

