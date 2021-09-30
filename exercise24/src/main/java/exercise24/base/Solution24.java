package exercise24.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Solution24 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution24 sol = new Solution24();

        //call method 'firstString'
        String firstString = sol.readFirstStringFromUser();
        //call method 'secondString'
        String secondString = sol.readSecondStringFromUser();
        //call method 'isAnagram'
        Boolean isAnagram = sol.seeIfItIsAnagram(firstString, secondString);

        //if isAnagram is true then print 'firstSting and secondString are anagrams'
        if (isAnagram = true) {
            System.out.println(firstString + " and " + secondString + " are anagrams");
        }
        //else print 'firstString and secondString are not anagrams'
        else {
            System.out.println(firstString + " and " + secondString + " are not anagrams");
        }
    }

    public Boolean seeIfItIsAnagram(String fS, String sS) {
        //create two new strings
        String s1 = fS.replaceAll("//s", "");
        String s2 = sS.replaceAll("//s", "");
        // create an if else based on if the strings are similar in length
        if (s1.length() != s2.length()) {
            //if they aren't similar return false
            return false;
        }
        else {
            //else change strings into arrays
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            //sort both of the arrays then check if they are equal to one another and if they are return true
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            if (Arrays.equals(ArrayS1, ArrayS2)) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    private String readSecondStringFromUser() {
        //Ask for user input and return the user input
        System.out.println("Enter the second string: ");
        String userInput = in.nextLine();
        return userInput;
    }

    private String readFirstStringFromUser() {
        //ask for user input and return the user input
        System.out.println("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String userInput = in.nextLine();
        return userInput;
    }

}
