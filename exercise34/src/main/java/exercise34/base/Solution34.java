package exercise34.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution34 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution34 sol = new Solution34();

        //create an array 'employeeArray'
        String[] employeeArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
        System.out.println("There are 5 employees: ");
        //Print the 'employeeArray'
        for (int i = 0; i < 5; i++) {
            System.out.println(employeeArray[i]);
        }
        //Call method 'askEmployee Remove'
        String askEmployee = sol.readAskEmployeeFromUser();
        //Call method 'deleteEmployee'
        String[] deleteEmployee = sol.deleteEmployee(askEmployee, employeeArray);

        System.out.println("\n There are 4 employees: ");
        for (int j = 0; j < 4; j++) {
            System.out.println(deleteEmployee[j]);
        }
    }

    private String readAskEmployeeFromUser() {
        System.out.println("Enter an employee name to remove: ");
        return in.nextLine();
        //Read and return the user input
    }

    public String[] deleteEmployee(String askEmployee, String[] employeeArray) {
        //Create a for loop that will 5 times and check if employee name is on list (then remove name)
        String[] newArr = null;
        for(int i = 0; i < employeeArray.length; i++){
            if(askEmployee.matches(employeeArray[i])){
                newArr = new String[employeeArray.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = employeeArray[index];
                }
                for(int j = i; j < employeeArray.length - 1; j++){
                    newArr[j] = employeeArray[j+1];
                }
                break;
            }
        }
        return newArr;
    }
}
