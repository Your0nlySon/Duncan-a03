package exercise33.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution33 sol = new Solution33();

        //Call method 'askQuestion'
        String askQuestion = sol.readUserQuestion();

        //Call method 'choose8Ball'
        sol.choose8Ball();
    }

    private String readUserQuestion() {
        //ask user for question and return it
    }

    private void choose8Ball() {
        //create an array called 'responses'
        //get a random number
        //print the 'responses' but chosen by the random number
    }
}
