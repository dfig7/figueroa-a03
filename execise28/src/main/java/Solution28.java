

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution28 {
    private static final Scanner input = new Scanner(System.in);

    public static int askNumbers() {
        //create answer
        int answer = 0;

        //for i=0: i<5; i++
        for(int i=0; i<5; i++) {
            //use a loop to ask the user for five numbers and adds them together
            System.out.printf("Enter a number: ");
            int num = input.nextInt();
            //answer += numbers
            answer += num;
        }
        //return added values
        return answer;
    }

    public static void main(String[] args) {
        //souf answer
        int x = askNumbers();
        System.out.printf("The total is %d.", x);
    }
}



