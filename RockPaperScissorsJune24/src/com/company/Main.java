package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

            String playerMove;
            String computerMove = "";
            boolean play = true;
            int computerInt;


            Scanner scan = new Scanner(System.in);
            Random generator = new Random();

            System.out.println("Welcome to Rock Paper Scissors\n" + "AUTOMATIC INCOGNITO MODE ENABLED\n"
                    + "No need to clear your history! INCOGNITO MODE ACTIVE\n"
                    + "\n" +
                    "*****Rules of the Game******\n" + "\n" + "Player and Computer go head-to-head" +
                    " with three separate options --- Rock, Paper, Scissors.\n"
                    + "If Player and Computer make the same move it results in a tie.\n"
                    + "Otherwise, Rock defeats Scissors - Scissors defeats Paper - Paper defeats Rock\n"
                    + "\n"
                    + "Program was specially designed to be case sensitive... Proceed with caution!\n");


        computerInt = generator.nextInt(3)+1;

        if (computerInt == 1)
            computerMove = "rock";
        else if (computerInt == 2)
            computerMove = "paper";
        else if (computerInt == 3)
            computerMove = "scissors";


        while(play == true) {

            System.out.println("What is your move? rock, paper or scissors: ");
            playerMove = scan.next();


            if (!(playerMove.equals("paper") || playerMove.equals("rock") || playerMove.equals("scissors")))
                System.out.println("Invalid Entry, Try Again");

            System.out.println("Computer's move is: " + computerMove);


            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie...");
            } else if (playerMove.equals("rock".toLowerCase())) {
                if (computerMove.equals("scissors"))
                    System.out.println("Rock defeats scissors! Player Wins :)");
                else if (computerMove.equals("paper"))
                    System.out.println("Paper defeats rock. Computer Wins :( ");
            } else if (playerMove.equals("paper".toLowerCase())) {
                if (computerMove.equals("scissors"))
                    System.out.println("Scissor defeats paper. Computer Wins :(");
                else if (computerMove.equals("rock"))
                    System.out.println("Paper defeats rock! You win :)");
            } else if (playerMove.equals("scissors".toLowerCase())) {
                if (computerMove.equals("paper"))
                    System.out.println("Scissor defeats paper! You win :)");
                else if (computerMove.equals("rock"))
                    System.out.println("Rock defeats scissors. You lose :(");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scan.next();
            if (playAgain.equals("yes"))
                play = true;
            else
                play = false;

        }
        System.out.println("Thank You for playing! Have a nice weekend!");
    }
}






