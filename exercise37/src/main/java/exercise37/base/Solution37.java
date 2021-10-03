package exercise37.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Random;
import java.util.Scanner;

public class Solution37 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution37 sol = new Solution37();

        //do loop to make sure letter are more than special and numbers combined
        //call method 'askLength'
        int askLength = sol.readLengthFromUser();
        //call method 'askSpecial'
        int askSpecial = sol.readSpecialFromUser();
        //call method 'askNum'
        int askNum = sol.readNumFromUser();
        //call method 'genRandomPass'
        String[] genRandomPass = sol.genRandomPass(askLength, askSpecial, askNum);
    }

    private int readLengthFromUser() {
        //read input from user and return
    }

    private int readSpecialFromUser() {
        //read input from user and return
    }

    private int readNumFromUser() {
        //read input from user and return
    }

    private String[] genRandomPass(int askLength, int askSpecial, int askNum) {
        //create string of all letters
        //create string of all numbers
        //create string of all special characters
        //for the size of special characters create a random number then add it to 'arrayPass'
        //for the size of numbers create a rng and then add it number to 'arrayPass'
        //for the rest of the remaining spots create a rng that adds the letter to 'arrayPass'
        //create a for loop that will switch the order of the array
        //return the array
    }
}

