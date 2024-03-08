package ticTacToOverAmbitious;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TicTacToeOverAmbitious{
        private final Player[] PLAYERS = new Player[2];
        private final Value[][] BOARD = new Value[4][4];
        private  final Set<Integer> set ;
        private int checker;

        public TicTacToeOverAmbitious(){
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
            checker++;
            checkInputThatFitInForRow1(position,value);
            checkInputThatFitInForRow2(position,value);
            checkInputThatFitInForRow3(position,value);
            checkInputThatFitInForRow4(position,value);
        }
        private void checkInputThatFitInForRow1(int input, Value type){
            if(input >0 && input<=4)BOARD[0][input-1] = type;

        }
        private void checkInputThatFitInForRow2(int input, Value type){
            if(input >4 && input<=8)BOARD[1][input-5] = type;
        }
        private void checkInputThatFitInForRow3(int input, Value type){
            if(input >8 && input<=12)BOARD[2][input-9] = type;
        }
        private void checkInputThatFitInForRow4(int input, Value type){
        if(input >12 && input<=16)BOARD[3][input-13] = type;
        }
        private void validatePlayerInput(int input){
            if(input >16) throw new IllegalArgumentException("Range Out Of Band\n Range Is Between 1 - 9");
        }
        public String getWinner() {
            return determineWinner();
        }
        private String determineWinner() {
            String winner = "";
            if(!checkIfWinnerIsInRow().isEmpty()){
                winner = checkIfWinnerIsInRow();
            }
            else if(!checkIfWinnerIsInColumn().isEmpty()){
                winner = checkIfWinnerIsInColumn();
            }
            else if(!checkIfWinnerWinsDiagonally().isEmpty()){
                winner = checkIfWinnerWinsDiagonally();
            }
            else if(checker == 16){ winner = "The Game Is A Draw";}
            return winner;
        }
        public String displayBoard(){
            StringBuilder expectedString = new StringBuilder();
            for (Value[] values : BOARD) {
                for (Value value : values) {
                    expectedString.append(printSpaceIfValueIsOorX(value)).append(" |");
                }
                expectedString.append("\n____________________________\n");
            }
            return expectedString.toString();
        }
        private String printSpaceIfValueIsOorX(Value value){
            if(value == Value.X || value == Value.O) return"  " + value + "  ";
            else return "" + Value.EMPTY;
        }
        public String toString(){
            return String.format("%s",displayBoard());
        }

        private String tellTheWinner(Value value){
            if(value == Value.X) return  "Player 1 Wins";
            else return  "Player 2 Wins";
        }
        private String checkIfWinnerIsInRow() {
            for (int count = 0; count < BOARD.length; count++) {
                if (BOARD[count][0] == BOARD[count][1] && BOARD[count][0] == BOARD[count][2] && BOARD[count][0] == BOARD[count][3] && BOARD[count][0] != Value.EMPTY) return tellTheWinner(BOARD[count][0]);
            }
            return "";
        }
        private String checkIfWinnerIsInColumn() {
            for (int count = 0; count < BOARD.length; count++) {
                if (BOARD[0][count] == BOARD[1][count] && BOARD[0][count] == BOARD[2][count] && BOARD[0][count] == BOARD[3][count] && BOARD[0][count] != Value.EMPTY) return tellTheWinner(BOARD[0][count]);

            }
            return "";
        }
        private String checkIfWinnerWinsDiagonally(){
            String winner = "";
            if (BOARD[0][0] == BOARD[1][1] && BOARD[0][0] == BOARD[2][2] && BOARD[0][0] == BOARD[3][3] && BOARD[0][0] !=Value.EMPTY)winner =  tellTheWinner(BOARD[0][0]);
            else if(BOARD[0][3] == BOARD[1][2] && BOARD[0][3] == BOARD[2][1] && BOARD[0][3] == BOARD[3][0] &&  BOARD[0][3] !=Value.EMPTY)winner =  tellTheWinner(BOARD[0][3]);
            return winner;
        }
    }


