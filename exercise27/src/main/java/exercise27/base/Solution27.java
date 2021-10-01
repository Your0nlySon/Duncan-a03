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
        System.out.println("Enter the first name: ");
        return in.nextLine();
    }

    private String readSecondNameFromUser() {
        //read input from user and return value
        System.out.println("Enter the last name: ");
        return in.nextLine();
    }

    private String readZIPCodeFromUser() {
        //read input from user and return value
        System.out.println("Enter the ZIP code: ");
        return in.nextLine();
    }

    private String readEIDFromUser() {
        //read input from user and return value
        System.out.println("Enter the employee ID: ");
        return in.nextLine();
    }

    public String validateUserInputs(String fN, String lN, String zC, String iD) {
        String fName, fName2, sName, sName2, zCode, eID, finalString;
        Boolean fNameB = false, fName2B = false, sNameB = false, sName2B = false, zCodeB= false, eIDB = false;
        //if statement that sees if fN is only filled
        if (fN.length() >= 0) {
            fNameB = true;
            fName = "";
        }
        //else state that The first name must be filled in
        else {
            fName = "\nThe first name must be filled in";
        }
        //if statement that see if sN has nothing in it
        if (lN.length() >= 0) {
            sNameB = true;
            sName = "";
        }
        //else state that the last name must be filled in
        else {
            sName = "\nThe last name must be filled in ";
        }
        //if statement to see if fN is longer than 2 characters
        if (fN.length() >= 2) {
            fName2B = true;
            fName2 = "";
        }
        //else state that first name must be two characters long
        else {
            fName2 = "\nThe first name must be at least 2 characters long";
        }
        //if statement to see if sN is longer than 2 characters
        if (lN.length() >= 2) {
            sName2B = true;
            sName2 = "";
        }
        //else state that last name must be two characters long
        else {
            sName2 = "\nThe last name must be at least 2 characters long";
        }
        //if iD has the first to sots as letters then a hyphen and then 4 numbers
        if(iD.matches("^[A-Z]{2}[-][0-9]{4}")) {
            eIDB = true;
            eID = "";
        }
        //else state that employee ID must be in that format
        else {
            eID = "The employee ID must be in the format of AA-1234";
        }
        //if the zipcode is 5 letters
        if(zC.matches("^[0-9]*$") && (zC.length() == 5)) {
            zCodeB = true;
            zCode = "";
        }
        //else state that the zipcode must be a 5 digit number.
        else {
            zCode = "The zipcode must be a 5 digit number";
        }
        if ((fNameB = true) && (fName2B = true) && (sNameB = true) && (sName2B = true) && (zCodeB = true) && (eIDB = true)) {
            finalString = "There were no errors found.";
        }
        else {
            finalString = fName + fName2 + sName + sName2 + eID + zCode;
        }
        return finalString;
    }
}
