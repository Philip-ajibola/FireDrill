package ticTacToTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacToTest {
    private TicTacTo ticTacTo;
    @BeforeEach
    public void initializeTicTacToGame(){
        ticTacTo = new TicTacTo();
    }

    @Test
    public void testThatGameHasOnlyTwoPlayer(){
        Player[] players = ticTacTo.getPlayers();
        assertEquals(2,players.length);
    }

    @Test
    public void testThatBoardValuesAtPointOfCreationIsEmpty(){
         Value empty = Value.EMPTY;
         Value[][] expectedBoard = {{empty,empty,empty},{empty,empty,empty},{empty,empty,empty}};
         Value[][] board =  ticTacTo.getBoard();
         assertArrayEquals(expectedBoard,board);
    }
    @Test
    public void testThatPlayerOneHasSpecificValue(){
        Player[] players = ticTacTo.getPlayers();
        assertEquals(Value.X,players[0].type());
    }
    @Test
    public void testThatPlayerTwoHasSpecificValue(){
        Player[] players = ticTacTo.getPlayers();
        assertEquals(Value.O,players[1].type());
    }
    @Test
    public void testThatPlayer1CanPlayAtRowOne(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,1);
        assertEquals(Value.X,ticTacTo.getBoard()[0][0]);
    }
    @Test
    public void testThatPlayerCanPlayAtRowOne(){
        Player[] players = ticTacTo.getPlayers();
        players[1].play(ticTacTo,1);
        assertEquals(Value.O,ticTacTo.getBoard()[0][0]);
    }


}