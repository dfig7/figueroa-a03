

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution33 {
    private static final Scanner input = new Scanner(System.in);
    //magicBall method
    public static void magicBall() {
        //create an array with all possible strings that ball can say
        String[] ball = {"Yes", "No", "Maybe", "Ask again later."};
        //ask user for their question
        System.out.printf("What's your question?\n> ");
        input.nextLine();
        //from 0 to array max length, randomly choose an answer from array
        System.out.printf("\n%s", ball[(int)(Math.random() * (ball.length+1) + 0)]);
        //souf
    }
    //main
    public static void main(String[] args) {
        magicBall();
        //call magicBall
    }
}
