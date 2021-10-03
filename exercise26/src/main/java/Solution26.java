
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution26 {
    private static final Scanner input = new Scanner(System.in);

    //make main method
    public static void main(String[] args) {
        //use payment calculator class
        PaymentCalculator x = new PaymentCalculator();
        //print the number of months in a souf rom the .calculateMonthsUntilPaidOff
        int numMonths = x.calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %d months to pay off this card.", numMonths);
    }
}
