
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

public class Solution32 {

    //setDifficulty method
        //save difficulty as 1, 2, or 3
            //if 1 --> 10
            //if 2 --> 100
            //if 3 --> 1000

    //createRandomNumber method
        //create a random number depending on difficulty chosen

    //create game method
        //call randomNumber method

    //create method where user guesses (int number)
        //while loop
        //ask user to guess
        //if wrong
            //determine if guess>number (too high) or if guess<number (too low)
                //make sure it is not non-numeric
                //throwexception
            //ask user to guess again
            //add 1 to counter per wrong answer
        //if right
            //print number of guesses
            //flag = false

    //create method to ask to keepPlaying
        //keepPlaying if return is true (y or Y)

    //create method for runGame
        //greet player with guess the number souf
        //do
        //call setdifficulty for number range
        //create winning number with randomNumber(range)
        //call user guesses method with winning number
        //while(keepPlaying is true) --> keep repeating anything under do

    //main
        //call run game method
}
