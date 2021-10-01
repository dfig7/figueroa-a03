import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */
public class Solution24 {
    private static final Scanner input = new Scanner(System.in);

    //make a method to receive string input;
    public static String getString() {
        return input.nextLine();
    }

    //method to check if the strings are anagrams
        //anagram: when two strings have the same characters but use it in different orders
    public static boolean isAnagram(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        //if not the same length, automatically not an anagram
        if (l1 != l2)
            return false;
        //Place string into characters in each array
        char[] charStringA = a.toCharArray();
        char[] charStringB = b.toCharArray();
        //sorts the strings in order
        Arrays.sort(charStringA);
        Arrays.sort(charStringB);
        //if it is missing a character or not the same character by the time the loop ends
            //return false
        for(int i =0; i< l1; i++){

            if(charStringA[i] != charStringB[i])
                return false;
            }
        //if everything works, method finally returns true
        return true;
    }



    public static void main(String[] args) {
        //ask for first string
        System.out.printf("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String a = getString();
        //ask for second string
        System.out.printf("Enter the second string: ");
        String b = getString();
        //compare strings with isAnagram method
        if(isAnagram(a,b)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", a, b);
        } else{
            System.out.printf("\"%s\" and \"%s\" are NOT anagrams.", a, b);
        }

    }
}
