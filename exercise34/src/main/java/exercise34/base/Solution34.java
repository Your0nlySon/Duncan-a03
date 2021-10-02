package exercise34.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution34 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution34 sol = new Solution34();

        //create an array 'employeeArray'
        //Print the 'employeeArray'
        //Call method 'askEmployee Remove'
        String askEmployee = sol.readAskEmployeeFromUser();
        //Call method 'deleteEmployee'
        String deleteEmployee = sol.deleteEmployee(askEmployee);

    }

    private String readAskEmployeeFromUser() {
        //Read and return the user input
    }

    public String deleteEmployee(String askEmployee) {
        //Create a for loop that will 5 times and check if employee name is on list (then remove name)
        // else it will say name is not removed
    }
}
