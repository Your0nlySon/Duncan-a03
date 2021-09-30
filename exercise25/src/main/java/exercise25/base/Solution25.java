package exercise25.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution25 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution25 sol = new Solution25();
        //call method 'userPassword'
        String userPassword = sol.readUserPasswordFromUser();
        //call method 'passwordValidator'
        int passwordValidator = sol.seeIfPasswordIsStrong(userPassword);
        //call method 'passwordSwitch'
        String passwordSwitch = sol.printTheStrengthOfPassword(passwordValidator, userPassword);
    }

    private String printTheStrengthOfPassword(int passwordValidator, String password) {
        //Switch statement
        //Case 0 = The password 'password' is of unknown strength.
        //Case 1 = The password 'password' is a very weak password.
        //Case 2 = The password 'password' is a weak password.
        //Case 3 = The password 'password' is a strong password.
        //Case 4 = The password 'password' is a very strong password.
    }

    private String readUserPasswordFromUser() {
        //ask the user for input and return that input
    }

    public int seeIfPasswordIsStrong(String uP) {
        //if password is all numbers and less than 8 return 1
        //else if password is all letter and is fever than 8 return 2
        //else if password contains letters and at least one number and is at least 8 return 3
        //else if password contains letters, numbers, and special characters and is at least 8 return 4
        //else return 0
    }
}
