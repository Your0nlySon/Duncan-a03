package exercise36.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution36 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution36 sol = new Solution36();

        //Call method 'askNum'
        Double[] askNum = sol.readAskNumFromUser();
        //call method 'average'
        Double average = sol.calcAverage(askNum);
        //call method 'max'
        Double max = sol.calcMax(askNum);
        //call method 'min'
        Double min = sol.calcMin(askNum);
        //call method 'std'
        Double std = sol.calcSTD(askNum, average);
    }

    private Double[] readAskNumFromUser() {
        //do loop
            //if input is a number, parse, then add to array
            //else if string matches done it will end the do loop and return the array
            //else print invalid input. try again
    }

    public Double calcAverage(Double[] askNum) {
        //average will add up all elements of the array and then divide by array length
    }

    public Double calcMax(Double[] askNum) {
        //will create a for loop to find the max number
    }

    public Double calcMin(Double[] askNum) {
        //will create a for loop to find the max number
    }

    public Double calcSTD(Double[] askNum, double average) {
        //create a for loop that runs and will square the element - mean
        //return the sqrt of the std/length
    }
}
