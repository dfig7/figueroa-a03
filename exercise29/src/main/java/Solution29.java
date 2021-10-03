
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution29 {
    private static final Scanner input = new Scanner(System.in);

    //this exercise is about catching exceptions
    //in findYears method
    public static void findYears() {
        boolean f = true;


        //use try
        while(f) {
            try {
                //ask souf: what the rate of return is and store in rate
                System.out.printf("What is the rate of return? ");
                //check if the number is 0 or not a number
                int x = Integer.parseInt(input.nextLine());
                //souf 72 formula: years = 72/rate
                int years = 72 / x;
                System.out.printf("It will take %d years to double your initial investment.", years);
                f = false;
            }
            //if not
             catch(NumberFormatException | ArithmeticException e){
                //catch number and arithmetic exceptions
                 System.out.printf("Sorry. That's not a valid input.");
            }
        }
    }
    //main
    public static void main(String[] args) {
        findYears();
    }
    //calcYears();

}
