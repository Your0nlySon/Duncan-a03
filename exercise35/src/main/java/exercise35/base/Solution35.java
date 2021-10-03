package exercise35.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution35 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution35 sol = new Solution35();
        //call method 'nameArray'
        String[] nameArray = sol.readStringFromUser();
        //call method 'pickRandWin'
        String pickRandWin = sol.pickRandWin(nameArray);
    }

    private String[] readStringFromUser() {
        //us a do loop that contains an if else
        //once the if is used end the string
        //else keeps do loop going
    }

    private String pickRandWin(String[] nameArray) {
        //get a random value that has an upper value of the string length
        //return the name of the random value from the array
    }
}
