package exercise31.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution31 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        //Call method 'userAge'
        int userAge = sol.readAgeFromUser();
        //Call method 'userRestingPulse'
        int userRestingPulse = sol.readRestingPulseFromUser();
        //Call method 'tableOfRates'
        int tableOfRates = sol.createTableOfRates(userAge, userRestingPulse);
    }

    private int readAgeFromUser() {
        //Ask user for age and return the age
        //if else statement that will check if the input is valid
    }

    private int readRestingPulseFromUser() {
        //Ask user for Resting Pulse and return the Resting Pulse
        //if else statement that will check if the input is valid
    }

    public int createTableOfRates(int uA, int uRP) {
       //Create for loop that increases by 5 from 55 to 95
       //Format Intensity%          | Rate BPM
    }
}
