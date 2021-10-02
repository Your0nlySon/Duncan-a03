package exercise32.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

public class Solution32 {

    public static void main(String[] args) {
        Solution32 sol = new Solution32();

        //do loop that ask if the user wants to continue
        //Call method 'askUser'
        int askUser = sol.readDifficultyLevelFromUser();
        //Call method 'getRandNum'
        int getRandNum = sol.getRandNum(askUser);
        //Call method 'guessChecker'
        sol.guessChecker(getRandNum);
    }

    private int readDifficultyLevelFromUser() {
        //Ask user for difficulty level and check if it is valid
        return 0;
    }

    private int getRandNum(int askUser) {
        //Through 'askUser' through if elseif it will find a random number
        return 0;
    }

    private void guessChecker(int getRandNum) {
        //make a do loop
        //if and else if the guess is greater than, less than, or equal to
    }
}