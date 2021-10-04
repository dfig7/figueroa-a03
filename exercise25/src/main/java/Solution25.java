/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution25 {
    private static final Scanner input = new Scanner(System.in);
    //create method to see if string has letters
    public static boolean lettersCheck(String a){
        if( a.matches("[a-z]") ||  a.matches("[A-Z]") )
            return true;
        else
            return false;
    }
    //create method to see if string has numbers
    public static boolean numbersCheck(String a){
        if( a.matches("[0-9]") )
            return true;
        else
            return false;
    }
    //create method to see if string has special characters
    public static boolean specialCheck(String a){
        if( a.matches("[~!@#$%^&*()_-]"))
            return true;
        else
            return false;
    }
    //create a method that validates the password
    public static int passwordValidator(String a) {
        //create flag for each to see if string has letters, numbers, special characters, and at least eight characters
        int l1 = a.length();
        int fEightCharacters = 0;
        boolean flagNumber = numbersCheck(a);
        boolean flagLetters = lettersCheck(a);
        boolean flagSpecial = specialCheck(a);

        if(l1>=8)
            fEightCharacters = 1;

        //Very Strong password has letters, numbers, special characters, and is at least eight characters
        if(flagNumber && flagLetters && flagSpecial && fEightCharacters==1){
            return 4;
        }
        //Strong password has letters, at least one number, and is at least eight characters
        else if(flagNumber && flagLetters && fEightCharacters==1){
            return 3;
        }
        //Weak password has only letters and is fewer than eight characters
        else if(flagNumber && fEightCharacters==1){
            return 2;
        }
        // A very weak password has only numbers and is fewer than eight characters
        else if(flagSpecial && fEightCharacters==0) {
            return 1;
        }
        //if none meet the rules, password is unknown strength
        else{
            return 0;
        }
    }
    //main
    public static void main(String[] args) {
        String x = input.nextLine();
        if(passwordValidator(x)==4){
            System.out.printf("The password \'%s\' is a very strong password.", x);
        }
        else if(passwordValidator(x)==3){
            System.out.printf("The password \'%s\' is a strong password.", x);
        }
        else if(passwordValidator(x)==2){
            System.out.printf("The password \'%s\' is weak password.", x);
        }
        else if(passwordValidator(x)==1){
            System.out.printf("The password \'%s\' is a very weak password.", x);
        }
        else if(passwordValidator(x)==0){
            System.out.printf("The password \'%s\' is an unknown strength password.", x);
        }
    }
}
