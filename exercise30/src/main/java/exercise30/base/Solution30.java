package exercise30.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution30 {

    public static void main(String[] args) {
        Solution30 sol = new Solution30();

        //initialize the table size
        int tableSize = 12;
        //call method 'printMultiplicationTable'
        sol.printMultiplicationTable(tableSize);
    }

    private void printMultiplicationTable(int tableSize) {
        // first print the top header row
        System.out.format("      ");
        //use a for loop to write the top numbers 1-12
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();

        for(int i = 1 ;i<=tableSize;i++) {
            // print left most column first
            System.out.format("%4d  ",i);
            //for loop to calc all the multiplication values
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
}

