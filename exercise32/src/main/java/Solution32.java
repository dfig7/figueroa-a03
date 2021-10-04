
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution32 {
    private static final Scanner input = new Scanner(System.in);


    //setDifficulty method
    //save difficulty as 1, 2, or 3
    //if 1 --> 10
    //if 2 --> 100
    //if 3 --> 1000
    public static int setDifficulty() {
        while (true) {
            try {
                int randomRange = 0;
                System.out.printf("\nEnter the difficulty level (1, 2, 3): ");
                int difficulty = Integer.parseInt(input.nextLine());
                if (difficulty == 1) {
                    randomRange = 10;
                } else if (difficulty == 2) {
                    randomRange = 100;
                } else if (difficulty == 3) {
                    randomRange = 1000;
                }
                return randomRange;
            } catch (NumberFormatException a) {
                System.out.printf("Invalid input.");
            }
        }
    }

    //createRandomNumber method
    public static int randomNumber(int a) {
        //create a random number depending on difficulty chosen
        int num = (int)(Math.floor(Math.random() * (a + 1) + 0));
        return num;
    }

    //create method where user guesses (int number)
    public static void guessInputs(int winningNumber) {
        boolean flag = true;
        int guesses = 0;
        //ask user to guess
        System.out.printf("I have my number. What's your guess? ");
        //while loop
        while (flag = true) {
            try {
                //add 1 to counter per try
                guesses++;
                int guess = Integer.parseInt(input.nextLine());
                //if wrong
                //determine if guess>number (too high) or if guess<number (too low)
                if (guess < winningNumber) {
                    System.out.printf("Too low. Guess again: ");
                } else if (guess > winningNumber) {
                    System.out.printf("Too high. Guess again: ");
                } else if (guess == winningNumber) {
                    //print number of guesses
                    //flag = false
                    System.out.printf("You got it in %d guesses!\n", guesses);
                    flag = false;
                }
                //make sure it is not non-numeric
                //throwexception
            } catch (NumberFormatException a) {
                System.out.printf("Invalid input. Guess again: ");
            }
        }
    }

    //create method to ask to playAgain
    public static boolean playAgain(){
        System.out.printf("\nDo you wish to play again (Y/N)? ");
        String x = input.nextLine();
        return (x.equals("y") || x.equals("Y"));
    }

    //create method for runGame
    public static void runGame() {
        //greet player with guess the number souf
        System.out.printf("Let's play Guess the Number!\n");
        boolean flag = true;
        //do
        do {
            //call setdifficulty for number range
            int randomRange = setDifficulty();
            //create winning number with randomNumber(range)
            int winningNumber = randomNumber(randomRange);
            //call user guesses method with winning number
            guessInputs(winningNumber);
            //while(playAgain is true) --> keep repeating anything under do
        } while (playAgain());
    }

    //playAgain if return is true (y or Y)

    //main
    public static void main (String[]args){
        runGame();
    }
    //call run game method
}
