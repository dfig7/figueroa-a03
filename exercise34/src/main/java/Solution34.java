
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    private static final Scanner input = new Scanner(System.in);

    //create a method that creates a list of 5 names
        //use ArrayList<String>
    public static ArrayList<String> employeeList() {
        //use .add to add string to array
        ArrayList<String> list = new ArrayList<String>();

        list.add("John Smith");

        list.add("Jackie Jackson");

        list.add("Chris Jones");

        list.add("Amanda Cullen");

        list.add("Jeremy Goodwin");

        return list;
    }
    //make a method that prints all 5 employees
    public static void printList(List<String> fullList) {
        //for loop (String employee: list)
        System.out.printf("\nThere are %d employees: \n", fullList.size());
        for(String employee: fullList)
            System.out.printf("%s\n", employee);

    }

    //create a method that removes an employee by the name input
    public static void removeEmployee(List<String> fullList) {
        System.out.printf("\nEnter an employee name to remove: ");
        //use .remove
        String name = input.nextLine();
        fullList.remove(name);
        printList(fullList);

    }
    //main
    public static void main(String[] args) {
        //create an employeeList
        //printEmployees
        //removeEmployees
        ArrayList<String> list = employeeList();
        printList(list);
        removeEmployee(list);

    }
}
