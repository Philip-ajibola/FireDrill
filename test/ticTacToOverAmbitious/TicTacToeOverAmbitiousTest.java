package ticTacToOverAmbitious;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeOverAmbitiousTest {
    private TicTacToeOverAmbitious ticTacTo;
    @BeforeEach
    public void initializeTicTacToGame(){
        ticTacTo = new TicTacToeOverAmbitious();
    }

    @Test
    public void testThatGameHasOnlyTwoPlayer(){
        Player[] players = ticTacTo.getPlayers();
        assertEquals(2,players.length);
    }

    @Test
    public void testThatBoardValuesAtPointOfCreationIsEmpty(){
        Value empty = Value.EMPTY;
        Value[][] expectedBoard = {{empty,empty,empty,empty},{empty,empty,empty,empty},{empty,empty,empty,empty},{empty,empty,empty,empty}};
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
    public void testThatPlayer1HaveSpecificID(){
        Player[] players = ticTacTo.getPlayers();
        assertEquals(1,players[0].id());
    }
    @Test
    public void testThatPlayer2HaveSpecificID(){
        Player[] players = ticTacTo.getPlayers();
        assertEquals(2,players[1].id());
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
    @Test
    public void testThatPlayer1CanPlayAtRowTwo(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,4);
        assertEquals(Value.X,ticTacTo.getBoard()[0][3]);
    }
    @Test
    public void testThatPlayerCanPlayAtRowTwo(){
        Player[] players = ticTacTo.getPlayers();
        players[1].play(ticTacTo,4);
        assertEquals(Value.O,ticTacTo.getBoard()[0][3]);
    }
    @Test
    public void testThatPlayer1CanPlayAtRowThree(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,7);
        assertEquals(Value.X,ticTacTo.getBoard()[1][2]);
    }
    @Test
    public void testThatPlayerCanPlayAtRowThree(){
        Player[] players = ticTacTo.getPlayers();
        players[1].play(ticTacTo,7);
        assertEquals(Value.O,ticTacTo.getBoard()[1][2]);
    }
    @Test
    public void testThatWhenABoxIsFilledAndPLayerTryToPlayThere(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,7);
        assertEquals(Value.X,ticTacTo.getBoard()[1][2]);
        assertThrows(IllegalArgumentException.class,()->players[1].play(ticTacTo,7));
    }
    @Test
    public void testThatWhenUserInputInvalidNumberExceptionIsThrown(){
        Player[] players = ticTacTo.getPlayers();
        assertThrows(IllegalArgumentException.class,()->players[1].play(ticTacTo,17));
    }
    @Test
    public void testThatPlayerCanWinWhenTheValueAreSameOnRoleOne(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,1);
        players[1].play(ticTacTo,7);
        players[0].play(ticTacTo,2);
        players[1].play(ticTacTo,6);
        players[0].play(ticTacTo,3);
        players[1].play(ticTacTo,9);
        players[0].play(ticTacTo,4);
        assertEquals("Player 1 Wins",ticTacTo.getWinner());
    }
    @Test
    public void testThatPlayerCanWinWhenTheValueAreSameOnRoleTwo(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,5);
        players[1].play(ticTacTo,1);
        players[0].play(ticTacTo,5);
        players[1].play(ticTacTo,3);
        players[0].play(ticTacTo,6);
        assertEquals("Player 1 Wins",ticTacTo.getWinner());
    }
    @Test
    public void testThatPlayerCanWinWhenTheValueAreSameOnRoleThree(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,4);
        players[1].play(ticTacTo,7);
        players[0].play(ticTacTo,1);
        players[1].play(ticTacTo,8);
        players[0].play(ticTacTo,6);
        players[1].play(ticTacTo,9);
        assertEquals("Player 2 Wins",ticTacTo.getWinner());
    }
    @Test
    public void testThatPlayerCanWinWhenTheValueAreSameOnColumnOne(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,1);
        players[1].play(ticTacTo,7);
        players[0].play(ticTacTo,2);
        players[1].play(ticTacTo,6);
        players[0].play(ticTacTo,3);
        assertEquals("Player 1 Wins",ticTacTo.getWinner());
    }
    @Test
    public void testThatPlayerCanWinWhenTheValueAreSameOnColumnTwo(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,2);
        players[1].play(ticTacTo,7);
        players[0].play(ticTacTo,5);
        players[1].play(ticTacTo,3);
        players[0].play(ticTacTo,8);
        assertEquals("Player 1 Wins",ticTacTo.getWinner());
    }
    @Test
    public void testThatPlayerCanWinWhenTheValueAreSameOnColumnThree(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,3);
        players[1].play(ticTacTo,2);
        players[0].play(ticTacTo,6);
        players[1].play(ticTacTo,5);
        players[0].play(ticTacTo,9);
        players[1].play(ticTacTo,1);
        assertEquals("Player 1 Wins",ticTacTo.getWinner());
    }
    @Test
    public void testThatPlayerCanWinWhenTheValueAreSameOnTheLeftDiagonal(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,4);
        players[1].play(ticTacTo,1);
        players[0].play(ticTacTo,2);
        players[1].play(ticTacTo,5);
        players[0].play(ticTacTo,6);
        players[1].play(ticTacTo,9);
        assertEquals("Player 2 Wins",ticTacTo.getWinner());
    }
    @Test
    public void testThatPlayersCanPlayDraw(){
        Player[] players = ticTacTo.getPlayers();
        players[0].play(ticTacTo,1);
        players[1].play(ticTacTo,2);
        players[0].play(ticTacTo,3);
        players[1].play(ticTacTo,5);
        players[0].play(ticTacTo,4);
        players[1].play(ticTacTo,7);
        players[0].play(ticTacTo,6);
        players[1].play(ticTacTo,9);
        players[0].play(ticTacTo,8);

        assertEquals("The Game Is A Draw",ticTacTo.getWinner());
    }

}