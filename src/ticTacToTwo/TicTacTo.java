package ticTacToTwo;

import java.util.Arrays;

public class TicTacTo {
    private final Player[] PLAYERS = new Player[2];
    private final Value[][] BOARD = new Value[3][3];

    public TicTacTo(){
        Player player1 = new Player(1, Value.X);
        Player player2 = new Player(2,Value.O);
        fillBoard();
    }

    public Player[] getPlayers() {
        return PLAYERS;
    }

    public Value[][] getBoard() {
        return BOARD;
    }
    private void fillBoard(){
        for(Value[] value: BOARD) Arrays.fill(value,Value.EMPTY);
    }
}
