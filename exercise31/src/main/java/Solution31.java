
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution31 {
    private static final Scanner input = new Scanner(System.in);

    //getRestingPulse method
    public static int getRestingPulse() {

        //make sure to have exception like question 29

        while (true) {
            try {
                System.out.print("Resting Pulse: ");
                int restingPulse = Integer.parseInt(input.nextLine());
                return restingPulse;
            } catch (NumberFormatException a) {
                System.out.printf("Invalid input.\n");
            }
        }
    }

    //getAge method
    //make sure to have exception like question 29
    public static int getAge() {

        //make sure to have exception like question 29

        while (true) {
            try {
                System.out.printf("Age: ");
                int age = Integer.parseInt(input.nextLine());
                return age;
            } catch (NumberFormatException a) {
                System.out.printf("Invalid input.\n");
            }
        }
    }

    //createUI method with (restingPulse, Age) as parameters
    public static void createUI(int restingPulse, int age) {

        //souf for category seperation
        System.out.printf("\nIntensity\t| Rate\n----------|------------");
        //for i==55; i<= 95; i +=5
        for (int i = 55; i <= 95; i += 5) {
            //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
            int targetPulse = (int)(((220 - age) - restingPulse) * (i / 100.0) + restingPulse);
            //souf print intensity and targetPulse
            System.out.printf("\n%d%%\t\t  | %d bpm\n", i, targetPulse);
        }
    }

    //main
    public static void main(String[] args) {
        //creeate GUI with method
        createUI(getRestingPulse(), getAge());
    }
}
