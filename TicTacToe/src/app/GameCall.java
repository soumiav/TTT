package app;

import java.util.Scanner;

public class GameCall {

   public static void main(String[] args) {

      System.out.println("\n WELCOME TO TIC TAC TOE ");
      System.out.println(" -----------------------");
      System.out.println("Please enter numbers between 1 and 9 to mark your position \n");


      TicTacToe game = new TicTacToe();

      char currentPlayer = 'o';

      while ((!game.checkForWin()) && (!game.isBoardFull())) {

         game.printBoard();
         System.out.print(" \n");

         Scanner sc = new Scanner(System.in);
         char num = sc.next().charAt(0);

         int numInt = num;
        

         if ((numInt >= 49) && (numInt < 58)) {
            game.placeMark(numInt);
            currentPlayer = game.currentPlayerMark;
            game.changePlayer();
         } else {
            System.out.println("Please enter numbers between 1 and 9 to mark your position \n");
         }
         
      }  

      if (game.checkForWin()) {
         game.printBoard();
         System.out.println(" \n We have a winner! Congrats  " + currentPlayer + " !\n");
         
         System.exit(0);
      } else if (game.isBoardFull()) {
         System.out.println("Appears we have a draw!");
         System.exit(0);
      }

      // No winner or draw, switch players to 'o'
      game.changePlayer();

   }

}