import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

public class PaymentCalculator {
    private static final Scanner input = new Scanner(System.in);

    //Make method that asks for the balance <getBalance>
    private double getBalance(){
        System.out.printf("What is your balance? ");
        return input.nextDouble();
    }

    //Make method that asks for the APR on the card as a percent
    private double getCardAPR(){
        System.out.printf("What is the APR on the card (as a percent)? ");
        return input.nextDouble();
    }
    //Make method that asks for the monthly payment
    private double getMonthlyPayment(){
        System.out.printf("What is the monthly payment you can make? ");
        return input.nextDouble();
    }
    //Make public method <calculateMonthsUntilPaidOff> --> has no parameters and returns the number of months
    //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
    public int calculateMonthsUntilPaidOff(){
        double b = getBalance();
        double apr = getCardAPR()/100/365;
        double mp = getMonthlyPayment();
        return (int)Math.ceil(-(1.0/30) * Math.log(1 + b/mp * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
    }
}


