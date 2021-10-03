
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Diego Figueroa
 */
public class Solution30 {

    //method that creates grid
    public static void createGrid(){
        //create 12 columns and rows

        //for i=1; i<=12; i++
        for(int i=1; i<=12; i++){
            System.out.printf("\n");

            //for j=1; j<=12; j++
            for(int j=1; j<=12; j++){
                //souf i*j
                System.out.printf("%3d", i*j);
            }
        }
    }


    //main

    public static void main(String[] args) {
        createGrid();
    }

}
