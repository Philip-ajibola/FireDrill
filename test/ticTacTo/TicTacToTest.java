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
        System.out.println(ticTacTo.displayBoard());
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
        System.out.println(ticTacTo.displayBoard());
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
        System.out.println(ticTacTo.displayBoard());
        assertArrayEquals(expectedBoard,board);
    }
    @Test
    public void testThatWhenPlayerChooseABoxThatIsFilledErrorIsThrown(){
        TicTacTo ticTacTo = new TicTacTo();
        //Value[][] board = ticTacTo.getBoard();
        Player player = new Player(1);
        Player player1 = new Player(2);
        Value[][] expectedBoard = {
                {Value.X,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY},
                {Value.EMPTY,Value.EMPTY,Value.EMPTY}
        };
        ticTacTo.playGame(player,1);
        assertThrows(IllegalArgumentException.class,()->ticTacTo.playGame(player1,1));
        System.out.println(ticTacTo.displayBoard());
        assertArrayEquals( expectedBoard,ticTacTo.getBoard());
    }
    @Test
    public void testThatWinnerCanBeChosen(){
        TicTacTo ticTacTo = new TicTacTo();
        Value[][] board = ticTacTo.getBoard();
        Player player = new Player(1);
        Player player1 = new Player(2);

        ticTacTo.playGame(player,1);
        ticTacTo.playGame(player1,5);
        ticTacTo.playGame(player,2);
        ticTacTo.playGame(player1,4);
        ticTacTo.playGame(player,3);

        System.out.println(ticTacTo.displayBoard());
        assertEquals("Player 1 Wins",ticTacTo.getWinner());

    }
}