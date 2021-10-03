package exercise35.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution35 sol = new Solution35();
        //call method 'nameArray'
        ArrayList<String> nameArray = sol.readStringFromUser();
        //call method 'pickRandWin'
        String pickRandWin = sol.pickRandWin(nameArray);
        System.out.println("The winner is... " + pickRandWin);
    }

    private ArrayList<String> readStringFromUser() {
        //use a do loop that contains an if else
        ArrayList<String> nameArr = new ArrayList<String>();
        int i = 0;
        do {
            System.out.println("Enter a name: ");
            String name = in.nextLine();
            if (name.matches("")) {
                i = 1;
            }
            else {
                nameArr.add(name);
            }
        } while (i == 0);
        //once the if is used end the string
        //else keeps do loop going
        return nameArr;
    }

    private String pickRandWin(ArrayList<String> nameArray) {
        //get a random value that has an upper value of the string length
        Random rand = new Random();
        int upperbound = nameArray.size();
        int int_random = rand.nextInt(upperbound);
        //return the name of the random value from the array
        return nameArray.get(int_random);
    }
}
