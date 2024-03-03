package ticTacTo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToTest {

    @Test
    public void testThatElementInBoardIsEmpty(){
        TicTacTo ticTacTo = new TicTacTo();
        Value[][] board = ticTacTo.getBoard();
        Player player = new Player(1);
        Value[][] expectedBoard = {
                {Value.X,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY}
        };
        ticTacTo.playGame(player,1);
        System.out.println(ticTacTo.displayBoard());
        assertArrayEquals(expectedBoard,board);
    }
}