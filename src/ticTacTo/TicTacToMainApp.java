package ticTacTo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToMainApp {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TicTacTo ticTacTo = new TicTacTo();
        playTicTacToContinuously(ticTacTo);
    }

    private static void playTicTacToGame(TicTacTo ticTacTo) {

        for(int count =1;count<=5;count++){
            System.out.println(ticTacTo);
            validatePlayer1Response(ticTacTo);
            System.out.println(ticTacTo);
            if(!ticTacTo.getWinner().isEmpty()){
                System.out.println(ticTacTo.getWinner());
                break;
            }
            if(count<5) {
                validatePlayer2Response(ticTacTo);
                if(!ticTacTo.getWinner().isEmpty()){
                    System.out.println(ticTacTo.getWinner());
                    break;
                }

            }

        }

    }
    private static void validatePlayer1Response(TicTacTo ticTacTo){
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
    private static void collectPlayer1Input(TicTacTo ticTacTo){
        int player1Response = 0;
        System.out.printf("Player %d Enter The Number Of Box You Want to Play ", ticTacTo.getPlayers()[0].getId());
        player1Response = input.nextInt();
        ticTacTo.playGame(ticTacTo.getPlayers()[0], player1Response);
    }
    private static void validatePlayer2Response(TicTacTo ticTacTo){
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
    private static void collectPlayer2Input(TicTacTo ticTacTo){
        int player1Response = 0;
        System.out.printf("Player %d Enter The Number Of Box You Want to Play ", ticTacTo.getPlayers()[1].getId());
        player1Response = input.nextInt();
        ticTacTo.playGame(ticTacTo.getPlayers()[1], player1Response);
    }

    public static void playTicTacToContinuously(TicTacTo ticTacTo){
        System.out.println("Welcome To The TicTacTo Game\n Player One Uses X And Player Two Uses O ");
        System.out.println();
        String userResponse = "";
        do{
            playTicTacToGame(ticTacTo);
            System.out.print("Do you want to continue playing??? (Yes Or No) ");
            userResponse = input.next();
            while(!userResponse.equalsIgnoreCase("yes") && !userResponse.equalsIgnoreCase("no")){
                System.out.print("Please enter Yes Or No To Continue ");
                userResponse = input.next();
            }
            ticTacTo = new TicTacTo();
        }while(userResponse.equalsIgnoreCase("yes"));
    }
}
