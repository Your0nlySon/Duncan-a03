package exercise28.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution28 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution28 sol = new Solution28();

        //call method 'numLoop'
        int[] numLoop = sol.readAndCalcNumFromUser();
        //call method 'calcLoop'
        int calcLoop = sol.calcTheSumFromArray(numLoop);

        System.out.println(calcLoop);
    }

    public int calcTheSumFromArray(int[] nL) {
        //initialize a double called 'sum'
        int sum = 0;
        //for loop that runs 5 times that adds up all the values of the array
        for (int i = 0;i < 5; i++) {
            sum += nL[i];
        }
        return sum;
    }

    private int[] readAndCalcNumFromUser() {
        //initialize an array called 'numArray' that has room for 5 numbers
        int[] numArray = new int[5];
        //for loop that runs 5 times and prompts for a number and then stores it in the array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            numArray[i] = Integer.parseInt(in.nextLine());
        }
        return numArray;
    }
}
