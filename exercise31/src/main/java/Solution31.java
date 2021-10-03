
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution31 {
    private static final Scanner input = new Scanner(System.in);

    //getRestingPulse method
    public static int getRestingulse() {

        //make sure to have exception like question 29

        while(true){
            try{
                System.out.printf("Resting Pulse: ");
                int restingPulse = Integer.parseInt(input.nextLine());
                return restingPulse;
            }
            catch(NumberFormatException a){
                System.out.printf("Invalid input.");
            }
        }
    }

    //getAge method
        //make sure to have exception like question 29

    //createUI method with (restingPulse, Age) as parameters
        //souf for category seperation
        //for i==55; i<= 95; i +=5
        //souf print intensity and rate

    //main
        //creeate GUI with method
}
