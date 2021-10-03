package exercise38.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution38 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution38 sol = new Solution38();

        //call method 'askNum'
        String askNum = sol.readAskNumFromUser();
        //call method 'filterEvenNumbers'
        sol.filterEvenNumbers(askNum);
    }

    private String readAskNumFromUser() {
        //ask for user input and return the string
    }

    private void filterEvenNumbers(String askNum) {
        //create an array called 'evenArray'
        //for loop with an if statement that adds the string to an array
        //then use % to find if there is no remainder
        //add that value to another array then print the array
    }
}
