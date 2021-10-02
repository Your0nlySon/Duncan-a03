package exercise31.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution31 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution31 sol = new Solution31();
        //Call method 'userAge'
        int userAge = sol.readAgeFromUser();
        //Call method 'userRestingPulse'
        int userRestingPulse = sol.readRestingPulseFromUser();
        //Call method 'tableOfRates'
        sol.createTableOfRates(userAge, userRestingPulse);
    }

    private int readAgeFromUser() {
        //Ask user for age and return the age
        //if else statement that will check if the input is valid
        Boolean value = false;
        int parsedAge = 0;

        do {
            System.out.println("Enter an age: ");
            String age = in.nextLine();

            if (age.matches("^[0-9]*$")) {
                parsedAge = Integer.parseInt(age);
                break;
            }
            else {
                System.out.print("Invalid input. Please input an int.");
            }
        } while (value = false);
        return parsedAge;
    }

    private int readRestingPulseFromUser() {
        //Ask user for Resting Pulse and return the Resting Pulse
        //if else statement that will check if the input is valid
        Boolean value = false;
        int parsedPulse = 0;

        do {
            System.out.println("Enter a Resting Pulse: ");
            String pulse = in.nextLine();

            if (pulse.matches("^[0-9]*$")) {
                parsedPulse = Integer.parseInt(pulse);
                break;
            }
            else {
                System.out.print("Invalid input. Please input an int.");
            }
        } while (value = true);
        return parsedPulse;
    }

    private void createTableOfRates(int uA, int uRP) {

        System.out.format("Resting Pulse: " + uRP + "        Age: " + uA);
        System.out.format("\nIntensity    | Rate");
        System.out.format("\n-------------|--------\n");
        int targetHeartRate;
       //Create for loop that increases by 5 from 55 to 95
       //Format Intensity%          | Rate BPM
       for (double i = 55; i <= 95; i += 5) {
           System.out.format("%.0f          | %.0f bpm\n",i,(((220 - uA) - uRP) * (i/100)) + uRP);
       }
    }
}
