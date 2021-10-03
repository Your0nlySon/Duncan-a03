package exercise37.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution37 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution37 sol = new Solution37();

        int i = 0;
        //do loop to make sure letter are more than special and numbers combined
        do {
            //call method 'askLength'
            int askLength = sol.readLengthFromUser();
            //call method 'askSpecial'
            int askSpecial = sol.readSpecialFromUser();
            //call method 'askNum'
            int askNum = sol.readNumFromUser();
            if (askLength < (askNum + askSpecial)) {
                System.out.println("You have too much special and numbers to make a password. Try again");
            }
            else {
                //call method 'genRandomPass'
                String genRandomPass = sol.genRandomPass(askLength, askSpecial, askNum);
                i = 1;
                sol.createPass(genRandomPass);
            }
        } while (i == 0);
    }

    private void createPass(String genRandomPass) {
        // Creating array of string length
        char[] ch = new char[genRandomPass.length()];

        // Copy character by character into array
        for (int i = 0; i < genRandomPass.length(); i++) {
            ch[i] = genRandomPass.charAt(i);
        }
        Random random = new Random();

        for (int i=0; i<20; i++) { // 20: is custom number
            int i1 = random.nextInt(ch.length);
            int i2 = random.nextInt(ch.length);

            char tmp = ch[i1];
            ch[i1] = ch[i2];
            ch[i2] = tmp;
        }

        System.out.print("Your password is ");
        for (int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
    }

    private int readLengthFromUser() {
        //read input from user and return
        System.out.println("Enter the minimum length? ");
        int length = Integer.parseInt(in.nextLine());
        return length;
    }

    private int readSpecialFromUser() {
        //read input from user and return
        System.out.println("Enter how many special characters? ");
        int special = Integer.parseInt(in.nextLine());
        return special;
    }

    private int readNumFromUser() {
        //read input from user and return
        System.out.println("Enter how many numbers? ");
        int num = Integer.parseInt(in.nextLine());
        return num;
    }

    private String genRandomPass(int askLength, int askSpecial, int askNum) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int letterLength = askLength - (askNum + askSpecial);
        //create string of all letters
        String letters = "abcdefghijklmnopqrstuvwxyz";
        //create string of all numbers
        String numbers = "0123456789";
        //create string of all special characters
        String special = "!@#$%^&*";
        //for the size of special characters create a random number then add it to 'arrayPass'
        for (int i = 0; i < askSpecial; i++) {
            int index = random.nextInt(special.length());
            char randomSpecial = special.charAt(index);
            sb.append(randomSpecial);
        }
        //for the size of numbers create a rng and then add it number to 'arrayPass'
        for (int i = 0; i < askNum; i++) {
            int index = random.nextInt(numbers.length());
            char randomNum = numbers.charAt(index);
            sb.append(randomNum);
        }
        //for the rest of the remaining spots create a rng that adds the letter to 'arrayPass'
        for (int i = 0; i < letterLength; i++) {
            int index = random.nextInt(letters.length());
            char randomLetter = letters.charAt(index);
            sb.append(randomLetter);
        }
        String randomChar = sb.toString();
       return randomChar;
        //return the array
    }
}

