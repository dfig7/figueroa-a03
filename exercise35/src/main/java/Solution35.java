
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner input = new Scanner(System.in);
    //create method that getsUserName and stores it in arrayList
    public static ArrayList<String> getUserNames() {
        ArrayList<String> list = new ArrayList<String>();
        //Have the method be a while loop that adds the names to list until list.length is 0
        while(true){
            //souf "Enter name: "
            System.out.printf("Enter a name: ");
            String name = input.nextLine();
            if(name.length()==0){
                return list;
            }
            list.add(name);
        }
    }

    //create randomGenerator (ArrayList list)
    public static void randomGenerator(ArrayList<String> list) {
        //chooses a random name from given parameter
        int random = (int)(Math.random() * (list.size()+1));
        System.out.printf("The winner is... %s", list.get(random));
    }
    //main
    public static void main(String[] args) {
        randomGenerator(getUserNames());
    }
    //randomGenerator(list)

}
