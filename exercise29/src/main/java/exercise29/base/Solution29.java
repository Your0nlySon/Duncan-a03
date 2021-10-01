package exercise29.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution29 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution29 sol = new Solution29();

        Boolean ifValid = false;
        //call method 'userInput'
        int userInput = sol.readInputFromUser();
        //call method 'calc72'
        Double calc72 = sol.calc72(userInput);
        //do loop until boolean is true
        //if functions that sees if 'userInput' is a number and is greater than zero. call method 'calc72'. boolean = true
        //else print Sorry. That's not a valid input, and call userInput again
    }

    private int readInputFromUser() {
        //read input from user and return value of 'uInput;
        return 0;
    }

    public Double calc72(int uI) {
        //parse uI
        readInputFromUser();
        //r = 72 / uI
        return 0.0;
    }
}
