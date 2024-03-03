package ticTacTo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class TicTacTo {
    private final Value[][] BOARD = new Value[3][3];
    private Player[] players = new Player[2];
    private Set<Integer> set ;
    public TicTacTo(){
        fillValuesWithEmpty();
        set = new HashSet<>();
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
            boolean condition = set.add(number);
            if(!condition)throw new IllegalArgumentException("Space is already filled");
            checkInputForPlayer(player,number);
    }
    private void checkInputForPlayer(Player player, int playerInput){
        checkInputThatFitInForRow1(player, playerInput);
        checkInputThatFitInForRow2(player,playerInput);
        checkInputThatFitInForRow3(player,playerInput);
    }
    private void checkInputThatFitInForRow1(Player player,int input){
        if(input >0 && input<=3 && player.getId() == 1){
            if(input ==1) BOARD[0][0] = Value.X;
            else if(input == 2) BOARD[0][1] = Value.X;
            else BOARD[0][2] = Value.X;
        }else if(input >0 && input<=3 && player.getId() == 2) {
            if(input ==1) BOARD[0][0] = Value.O;
            else if(input == 2) BOARD[0][1] = Value.O;
            else BOARD[0][2] = Value.O;
        }
    }
    private void checkInputThatFitInForRow2(Player player,int input){
        if(input >3 && input<=6 && player.getId() == 1){
            if(input == 4) BOARD[1][0] = Value.X;
            else if(input == 5) BOARD[1][1] = Value.X;
            else BOARD[1][2] = Value.X;
        }else if(input >3 && input<=6 && player.getId() == 2) {
            if(input ==4) BOARD[1][0] = Value.O;
            else if(input == 5) BOARD[1][1] = Value.O;
            else BOARD[1][2] = Value.O;
        }
    }
    private void checkInputThatFitInForRow3(Player player,int input){
        if(input >6 && input<=9 &&  player.getId() == 1){
            if(input == 7) BOARD[2][0] = Value.X;
            else if(input == 8) BOARD[2][1] = Value.X;
            else BOARD[2][2] = Value.X;
        }else if(input >6 && input<=9 && player.getId() == 2) {
            if(input ==7) BOARD[2][0] = Value.O;
            else if(input == 8) BOARD[2][1] = Value.O;
            else BOARD[2][2] = Value.O;
        }
    }

    public Value[][] getBoard() {
        return BOARD;
    }
    public String displayBoard(){
        String expectedString = "";
        for (Value[] values : BOARD) {
            for (int counter = 0; counter < values.length; counter++) {

                expectedString += printSpaceIfValueIsOorX(values[counter]) + " |";
            }
            expectedString +="\n______________________\n";
        }
        return expectedString;
    }

    public String toString(){
        return String.format("%s",displayBoard());
    }
    private String printSpaceIfValueIsOorX(Value value){
        if(value == Value.X || value == Value.O) return value + "    ";
        else return "" + Value.EMPTY;
    }
    public String DisplayTheWinner(){
        return getWinner();
    }

    private String getWinner() {
        String winner = "";
        if(BOARD[0][0] == BOARD[0][1] && BOARD[0][0] == BOARD[0][2] && BOARD[0][0] !=Value.EMPTY){
            if(BOARD[0][0] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        } else if(BOARD[1][0] == BOARD[1][1] && BOARD[1][0] == BOARD[1][2] && BOARD[1][0] !=Value.EMPTY){
            if(BOARD[1][0] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        }else if(BOARD[2][0] == BOARD[2][1] && BOARD[2][0] == BOARD[2][2] && BOARD[2][0] !=Value.EMPTY){
            if(BOARD[2][0] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        }else if(BOARD[0][0] == BOARD[1][0] && BOARD[0][0] == BOARD[2][0] && BOARD[0][0] !=Value.EMPTY){
            if(BOARD[0][0] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        }else if(BOARD[0][1] == BOARD[1][1] && BOARD[0][1] == BOARD[2][1] && BOARD[0][1] !=Value.EMPTY){
            if(BOARD[0][1] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        }else if(BOARD[0][2] == BOARD[1][2] && BOARD[0][2] == BOARD[2][2] && BOARD[0][2] !=Value.EMPTY){
            if(BOARD[0][2] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        }else if(BOARD[0][0] == BOARD[1][1] && BOARD[0][0] == BOARD[2][2] && BOARD[0][0] !=Value.EMPTY){
            if(BOARD[0][0] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        }else if(BOARD[0][2] == BOARD[1][1] && BOARD[0][2] == BOARD[2][0] && BOARD[0][2] !=Value.EMPTY){
            if(BOARD[0][2] == Value.X) winner = "Player 1 Wins";
            else winner = "Player 2 Wins";
        }
        return winner;
    }
}

