package ticTacToOverAmbitious;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
        public static void main(String[] args) {
            TicTacToeOverAmbitious ticTacTo = new TicTacToeOverAmbitious();
            playTicTacToContinuously(ticTacTo);
        }
        private static Scanner input = new Scanner(System.in);
        private static void playTicTacToGame(TicTacToeOverAmbitious ticTacTo) {
            for(int count =1;count<=5;count++){
                validatePlayer1Response(ticTacTo);
                System.out.println(ticTacTo);
                if(!ticTacTo.getWinner().isEmpty()){
                    System.out.println(ticTacTo.getWinner());
                    break;
                }
                if(count<5) {
                    validatePlayer2Response(ticTacTo);
                    System.out.println(ticTacTo);
                    if(!ticTacTo.getWinner().isEmpty()){
                        System.out.println(ticTacTo.getWinner());
                        break;
                    }

                }
            }
        }
        private static void validatePlayer1Response(TicTacToeOverAmbitious ticTacTo){
            boolean condition = true;
            while(condition) {
                try {
                    collectPlayer1Input(ticTacTo);
                    condition = false;
                } catch (IllegalArgumentException | InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        private static void collectPlayer1Input(TicTacToeOverAmbitious ticTacTo){
            int player1Response = 0;
            System.out.printf("Player %d Enter The Number Of Box You Want to Play ", ticTacTo.getPlayers()[0].id());
            player1Response = input.nextInt();
            ticTacTo.pickPosition( player1Response,ticTacTo.getPlayers()[0].type());
        }
        private static void validatePlayer2Response(TicTacToeOverAmbitious ticTacTo){
            boolean condition = true;
            while(condition) {
                try {
                    collectPlayer2Input(ticTacTo);
                    condition = false;
                } catch (IllegalArgumentException | InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        private static void collectPlayer2Input(TicTacToeOverAmbitious ticTacTo){
            int player1Response = 0;
            System.out.printf("Player %d Enter The Number Of Box You Want to Play ", ticTacTo.getPlayers()[1].id());
            player1Response = input.nextInt();
            ticTacTo.pickPosition( player1Response,ticTacTo.getPlayers()[1].type());
        }

        public static void playTicTacToContinuously(TicTacToeOverAmbitious ticTacTo){
            System.out.println("Welcome To The TicTacTo Game\n Player One Uses X And Player Two Uses O \n Note This is a 4 by 4 TicTacTeo game it might get tricky :) ");
            System.out.println();
            String userResponse = "";
            do{
                System.out.println(ticTacTo);
                playTicTacToGame(ticTacTo);
                System.out.println("Do you want to continue playing??? (Yes Or No) ");
                userResponse = input.next();
                while(!userResponse.equalsIgnoreCase("yes") && !userResponse.equalsIgnoreCase("no")){
                    System.out.println("Please enter Yes Or No To Continue ");
                    userResponse = input.next();
                }
                ticTacTo = new TicTacToeOverAmbitious();
            }while(userResponse.equalsIgnoreCase("yes"));
            System.out.println("THANK YOU FOR PLAYING TICTACTO GAME \n HOPE YOU ENJOYED PLAYING IT ");
        }
}


