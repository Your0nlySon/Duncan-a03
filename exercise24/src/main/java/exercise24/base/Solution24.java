package exercise24.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution24 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution24 sol = new Solution24();

        //call method 'firstString'
        String firstString = sol.readFirstStringFromUser();
        //call method 'secondString'
        String secondString = sol.readSecondStringFromUser();
        //call method 'isAnagram'
        Boolean isAnagram = sol.seeIfItIsAnagram(firstString, secondString);

        //if isAnagram is true then print 'firstSting and secondString are anagrams'
        //else print 'firstString and secondString are not anagrams'
    }

    public Boolean seeIfItIsAnagram(String fS, String sS) {
        //create two new strings
        //set boolean to true
        // create an if else based on if the strings are similar in length
        //if they aren't similar return false
        //else change strings into arrays
        //sort both of the arrays then check if they are equal to one another and if they are return true
    }

    private String readSecondStringFromUser() {
        //Ask for user input and return the user input
    }

    private String readFirstStringFromUser() {
        //ask for user input and return the user input
    }

}
