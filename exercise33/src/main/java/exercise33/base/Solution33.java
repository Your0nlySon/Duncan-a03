package exercise33.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

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
        System.out.println("What's your question? ");
        return in.nextLine();
    }


    private void choose8Ball() {
        //create an array called 'responses'
        String[] responses = {"Yes", "No", "Maybe", "Ask again later"};
        //print the 'responses' but chosen by the random number
        System.out.println(responses[randNumber()]);
    }

    public int randNumber() {
        Random rand = new Random();
        int upperbound = 4;
        int int_random = rand.nextInt(upperbound);

        return  int_random;
    }
}