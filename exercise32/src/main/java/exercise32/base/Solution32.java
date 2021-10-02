package exercise32.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Random;
import java.util.Scanner;

public class Solution32 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution32 sol = new Solution32();

        //do loop that ask if the user wants to continue
        String quit = "";
        do {
            //Call method 'askUser'
            int askUser = sol.readDifficultyLevelFromUser();
            //Call method 'getRandNum'
            int getRandNum = sol.getRandNum(askUser);
            //Call method 'guessChecker'
            sol.guessChecker(getRandNum);

                System.out.println("Do you wish to play again (Y/N)? ");
                quit = in.nextLine();
        } while (quit.matches("[Yy]"));
    }

    private int readDifficultyLevelFromUser() {
        //Ask user for difficulty level and check if it is valid
        Boolean valid = false;
        int diffLevel = 0;
        do {
            System.out.println("Enter the difficulty level (1, 2, or 3): ");
            String userInput = in.nextLine();

            if (userInput.matches("1") || userInput.matches("2") || userInput.matches("3")) {
                diffLevel = Integer.parseInt(userInput);
                break;
            }
            else {
                System.out.println("Invalid input. Try again");
            }
        } while (valid = false);
        return diffLevel;
    }

    private int getRandNum(int askUser) {
        int guessedNum = 0;
        //Through 'askUser' through if elseif it will find a random number
        if (askUser == 1) {
            Random rand = new Random();
            int upperbound = 10;
            int int_random = rand.nextInt(upperbound);
            guessedNum = int_random + 1;
        }
        else if (askUser == 2) {
            Random rand = new Random();
            int upperbound = 100;
            int int_random = rand.nextInt(upperbound);
            guessedNum = int_random + 1;
        }
        else {
            Random rand = new Random();
            int upperbound = 1000;
            int int_random = rand.nextInt(upperbound);
            guessedNum = int_random + 1;
        }
        return guessedNum;
    }

    private void guessChecker(int getRandNum) {
        //make a do loop
        System.out.println("I have my number. ");
        int guess = 0;
        int i = 1;
        Boolean valid;
        do {
            do {
                System.out.println("What's your guess? ");
                String guessString = in.nextLine();
                if (guessString.matches("^[0-9]*$")) {
                    guess = Integer.parseInt(guessString);
                    valid = true;
                }
                else {
                    System.out.println("Invalid input. Please try again");
                    valid = false;
                }
            } while (valid = false);

            //if and else if the guess is greater than, less than, or equal to
            if (guess == getRandNum) {
                System.out.println("You got it in " + i + " guesses!");
                break;
            }
            else if (guess > getRandNum) {
                System.out.println("Too high");
            }
            else if ((guess < getRandNum) && (guess != 0)) {
                System.out.println("Too low");
            }
            i += 1;
        } while (guess != getRandNum);
    }
}