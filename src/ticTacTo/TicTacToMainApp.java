package ticTacTo;

import java.util.Scanner;

public class TicTacToMainApp {

    public static void main(String[] args) {
        TicTacTo ticTacTo = new TicTacTo();
        playTicTacToGame(ticTacTo);
    }

    private static void playTicTacToGame(TicTacTo ticTacTo) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The TicTacTo Game\n Player One Uses X And Player Two Uses O ");
        System.out.println(ticTacTo);
        int player1Response = 0;
        for(int count =1;count<=5;count++){
            System.out.printf("Player %d Enter The Number Of Box You Want to Play",ticTacTo.getPlayers()[0].getId());
             player1Response = input.nextInt();
            ticTacTo.playGame(ticTacTo.getPlayers()[0],player1Response);
            System.out.println(ticTacTo);
            if(count<5) {
                System.out.printf("Player %d Enter The Number Of Box You Want to Play",ticTacTo.getPlayers()[1].getId());
                 player1Response = input.nextInt();
                ticTacTo.playGame(ticTacTo.getPlayers()[1], player1Response);
                System.out.println(ticTacTo);
                System.out.println();
            }
            if(!ticTacTo.getWinner().isEmpty())break;
        }
        System.out.println(ticTacTo.getWinner());
    }
}
