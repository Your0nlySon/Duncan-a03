package exercise38.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution38 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution38 sol = new Solution38();

        //call method 'askNum'
        String askNum = sol.readAskNumFromUser();
        //call method 'filterEvenNumbers'
        sol.filterEvenNumbers(askNum);
    }

    private String readAskNumFromUser() {
        //ask for user input and return the string
        System.out.println("Enter a list of numbers, separated by spaces: ");
        return in.nextLine();
    }

    private void filterEvenNumbers(String askNum) {
        //create an array called 'evenArray'
        char[] evenArray = new char[askNum.length()];
        int finalArray[];
        //for loop with an if statement that adds the string to an array
        for (int i = 0; i < askNum.length(); i++) {
                evenArray[i] = askNum.charAt(i);
        }

        //then use % to find if there is no remainder
        System.out.print("The even numbers are");
        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 == 0) {
                System.out.print(evenArray[i]);
            }
            else {
                continue;
            }
        }
        //add that value to another array then print the array
    }
}
