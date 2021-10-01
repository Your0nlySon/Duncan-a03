package exercise27.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution27 {
        private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution27 sol = new Solution27();

        //call method 'firstName'
        String firstName = sol.readFirstNameFromUser();
        //call method 'secondName'
        String secondName = sol.readSecondNameFromUser();
        //call method 'zipCode'
        String zipCode = sol.readZIPCodeFromUser();
        //call method 'eID'
        String eID = sol.readEIDFromUser();
        //call method 'validateInput'
        String validateInput = sol.validateUserInputs(firstName, secondName, zipCode, eID);
    }

    private String readFirstNameFromUser() {
        //read input from user and return value
    }

    private String readSecondNameFromUser() {
        //read input from user and return value
    }

    private String readZIPCodeFromUser() {
        //read input from user and return value
    }

    private String readEIDFromUser() {
        //read input from user and return value
    }

    public String validateUserInputs(String fN, String lN, String zC, String iD) {
        //if statement that sees if fN is only filled
        //else state that The first name must be filled in
        //if statement that see if sN has nothing in it
        //else state that the last name must be filled in
        //if statement to see if fN is longer than 2 characters
        //else state that first name must be two characters long
        //if statement to see if sN is longer than 2 characters
        //else state that last name must be two characters long
        //if iD has the first to sots as letters then a hyphen and then 4 numbers
        //else state that employee ID must be in that format
        //if the zipcode is 5 letters
        //else state that the zipcode must be a 5 digit number.
    }
}
