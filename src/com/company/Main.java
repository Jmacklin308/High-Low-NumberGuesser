package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //play again?
        String restart = "";



        do{
            //Count guesses
            int playerGuesses = 0;
            int guessesLeft = 5;

            //generate a random number per game
            int randNum = (int) (Math.random() * 100 + 1);
            ////print out the number
            System.out.println(randNum);


            int guess = 0;
            //TODO: create game loop
            while (guess != randNum && guessesLeft != 0)
            {
                System.out.println("Guess an number between 1 and 100: ");
                System.out.println("You have " + guessesLeft + " guesses left.");
                guess = scanner.nextInt();


                //TODO: conditions for winning/losing
                if (guess < randNum) {
                    System.out.println("****** Guess was to low! ******");
                    guessesLeft -= 1;
                    playerGuesses += 1;
                }else if (guess > randNum){
                    System.out.println("****** Guess was to high! ******");
                    guessesLeft -= 1;
                    playerGuesses += 1;
                }else {
                    System.out.println("****** You guessed right! You win! ******");
                    System.out.println("****** it took you "+ playerGuesses + " guesses! ******");
                }
            }

            //Restart?
            System.out.println("-----------------------------------");
            System.out.println("Would you like to play again? (y/n)");
            restart = scanner.next();

            if(restart.equalsIgnoreCase("y"))
            {
                guessesLeft = 5;
            }
        } while (restart.equalsIgnoreCase("y")); //Kill if player types in n


        System.out.print("Thank you for playing!!");

        //close the resources
        scanner.close();


    }
}
