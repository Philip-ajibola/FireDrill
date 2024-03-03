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
    @Test
    public void testThatPlayerCanPlayGame(){
        TicTacTo ticTacTo = new TicTacTo();
        Value[][] board = ticTacTo.getBoard();
        Player player = new Player(1);
        Value[][] expectedBoard = {
                {Value.X,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY}
        };
        ticTacTo.playGame(player,1);
        assertArrayEquals(expectedBoard,board);
    }
    @Test
    public void testThatTwoPlayerCanPlayGame(){
        TicTacTo ticTacTo = new TicTacTo();
        Value[][] board = ticTacTo.getBoard();
        Player player = new Player(1);
        Player player1 = new Player(2);
        Value[][] expectedBoard = {
                {Value.X,Value.O,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY}
        };
        ticTacTo.playGame(player,1);
        ticTacTo.playGame(player1,2);
        assertArrayEquals(expectedBoard,board);
    }
    @Test
    public void testThatWhenPlayerChooseABoxThatIsFilledErrorIsThrown(){
        TicTacTo ticTacTo = new TicTacTo();
        Player player = new Player(1);
        Player player1 = new Player(2);
        Value[][] expectedBoard = {
                {Value.X,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY}
        };
        ticTacTo.playGame(player,1);
        assertThrows(IllegalArgumentException.class,()->ticTacTo.playGame(player1,1));
        assertArrayEquals( expectedBoard,ticTacTo.getBoard());
    }
    @Test
    public void testThatWinnerCanBeChosen(){
        TicTacTo ticTacTo = new TicTacTo();
        Player player = new Player(1);
        Player player1 = new Player(2);

        ticTacTo.playGame(player,1);
        ticTacTo.playGame(player1,5);
        ticTacTo.playGame(player,2);
        ticTacTo.playGame(player1,4);
        ticTacTo.playGame(player,3);

        assertEquals("Player 1 Wins",ticTacTo.getWinner());

    }
    @Test
    public void testThatGameCanBeDraw(){
        TicTacTo ticTacTo = new TicTacTo();
        Player player = new Player(1);
        Player player1 = new Player(2);

        ticTacTo.playGame(player,1);
        ticTacTo.playGame(player1,4);
        ticTacTo.playGame(player,9);
        ticTacTo.playGame(player1,3);
        ticTacTo.playGame(player,7);
        ticTacTo.playGame(player1,8);
        ticTacTo.playGame(player,6);
        ticTacTo.playGame(player1,5);
        ticTacTo.playGame(player,2);
       // System.out.println(ticTacTo);

        assertEquals("The Game Is A Draw",ticTacTo.getWinner());

    }
    @Test
    public void testThatPlayerDiagonally(){
        TicTacTo ticTacTo = new TicTacTo();
        Player player = new Player(1);
        Player player1 = new Player(2);

        ticTacTo.playGame(player,1);
        ticTacTo.playGame(player1,4);
        ticTacTo.playGame(player,2);
        ticTacTo.playGame(player1,3);
        ticTacTo.playGame(player,5);
        ticTacTo.playGame(player1,8);
        ticTacTo.playGame(player,9);
        ticTacTo.playGame(player1,7);

        assertEquals("Player 1 Wins",ticTacTo.getWinner());

    }
}