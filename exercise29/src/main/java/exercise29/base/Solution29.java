package exercise29.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution29 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution29 sol = new Solution29();

        Boolean ifValid;
        //do loop until boolean is true
        do {
            //call method 'userInput'
            String userInput = sol.readInputFromUser();

            if (userInput.matches("^[0-9]*$")) {
                //call method 'calc72'
                int uIToINT = Integer.parseInt(userInput);
                if (uIToINT > 0) {
                    Double calc72 = sol.calc72(uIToINT);
                    System.out.println("It will take " + calc72 + "to double your initial investment.");
                    break;
                }
                else {
                    System.out.println("Sorry. That's not a valid input.\n");
                    ifValid = false;
                }
            }
            else {
                System.out.println("Sorry. That's not a valid input.\n");
                ifValid = false;
            }
        } while(ifValid == true);
        //if functions that sees if 'userInput' is a number and is greater than zero. call method 'calc72'. boolean = true
        //else print Sorry. That's not a valid input, and call userInput again
    }

    private String readInputFromUser() {
        //read input from user and return value of 'uInput;
        System.out.println("Enter a number: ");
        String uInput = in.nextLine();
        return uInput;
    }

    public Double calc72(int uI) {
        //'r' = 72/input
        double r = 72 / uI;
        //return r
        return r;
    }
}
