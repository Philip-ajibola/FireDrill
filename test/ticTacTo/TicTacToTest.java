package ticTacTo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToTest {

    @Test
    public void testThatElementInBoardIsEmpty(){
        TicTacTo ticTacTo = new TicTacTo();
        Value[][] board = ticTacTo.getBoard();
        Value[][] expectedBoard = {
                {Value.EMPTY,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY}
        };
        assertArrayEquals(expectedBoard,board);
    }
}