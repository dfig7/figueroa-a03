import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */
public class Solution24 {
    private static final Scanner input = new Scanner(System.in);

    //make a method to receive string input;
    public static String getString(){
        String x = input.toString();
        return x;
    }
    //method to ask user for strings
    public static void askStrings(){
        //ask user for first string input
        System.out.printf("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String a = getString();
        //ask user for second string input
        System.out.printf("Enter the second string: ");
        String b = getString();
    }

    //method to check if the strings are anagrams
    //anagram when two strings have the same characters but use it in different orders
    public static boolean isAnagram(String a, String b){
        int l1 = a.length();
        int l2 = b.length();

        if(l1 != l2){
            return false;

        char[] c1 =

    }
    }
}
