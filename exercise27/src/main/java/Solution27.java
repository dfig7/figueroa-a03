
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.Scanner;

public class Solution27 {
    private static final Scanner input = new Scanner(System.in);

    //get input
    // souf "Enter the first name: "
    public static String getFirstName() {
        System.out.printf("Enter the first name: ");

        //return user's first name
        return input.nextLine();
    }

    // souf "Enter last name: "
    public static String getLastName() {
        System.out.printf("Enter the last name: ");
        //return user's last name
        return input.nextLine();
    }

    // souf "Enter zip code: "
    public static String getZip() {
        System.out.printf("Enter the ZIP code: ");
        //return zip
        return input.nextLine();
    }
    // souf "Enter Employee ID: "
    public static String getID() {
        System.out.printf("Enter the employee ID: ");
        //return ID
        return input.nextLine();
    }


    // Validate methods
        //validate first name
    public static String validateFirst(String a) {
        String val = "";
        //if first name length < 2
        if(a.length() < 2)
           //error
            val += "The first name must be at least 2 characters long. \n";

        if(a.length() == 0)
            val += "The first name must be filled in. \n";

        return val;
    }

        //validate last name
    public static String validateLast(String a) {
        String val = "";
        //if last name length < 2
        if (a.length()< 2)
        //error
        val += "The last name must be at least 2 characters long. \n";

        if(a.length() == 0)
            val += "The last name must be filled in. \n";

        return val;

    }
        //validate employee id
    public static String validateID(String a) {
        String val = "";
        //if id is not 2 letters, a dash, and then 4 numbers <AA-####>
        if(!a.matches("[a-zA-Z]{2}[-]{1}[0-9]{4}"))
            val += "The employee ID must be in the format of AA-1234. \n";
        //error
        return val;
    }
        //validate zip
    public static String validateZIP(String a) {
        //if zip is not a five digit number
        String val = "";

        if (!a.matches("[0-9]{5}"))
            val += "The zipcode must be a 5 digit number. \n";
        //error
        return val;

    }

    //ValidateInput
        //method validates through all the validation tests
    public static String validateInput(String firstName, String lastName, String zip, String Id) {
        String x = validateFirst(firstName) + validateLast(lastName) + validateZIP(zip) + validateID(Id);
        //returns errors from tests
        //if no errors
        //souf "no errors"
        if(x.length() == 0){
            return "There were no errors.";
        }
        //else return errors
        else {
            return x;
        }
    }

    //main
    public static void main(String[] args) {
        System.out.printf(validateInput(getFirstName(), getLastName(), getZip(), getID()));
    }
        //one souf that prints validateInput
}
