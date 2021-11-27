package exercise36.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.*;

public class Solution36 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution36 sol = new Solution36();

        //Call method 'askNum'
        ArrayList<Double> askNum = sol.readAskNumFromUser();
        //call method 'average'
        Double average = sol.calcAverage(askNum);
        //call method 'max'
        Double max = sol.calcMax(askNum);
        //call method 'min'
        Double min = sol.calcMin(askNum);
        //call method 'std'
        String std = sol.calcSTD(askNum, average);

        System.out.println("The average is " + average + "\nThe minimum is " + min + "\nThe maximum is " + max + "\nThe standard deviation is " + std);
    }

    private ArrayList<Double> readAskNumFromUser() {
        //do loop
            //if input is a number, parse, then add to array
            //else if string matches done it will end the do loop and return the array
            //else print invalid input. try again
        ArrayList<Double> askNum = new ArrayList<Double>();
        int i = 0;
        int d = 0;
        do {
            System.out.println("Enter a number: ");
            String num = in.nextLine();

            if (num.matches("^[0-9]*$")) {
                askNum.add(Double.parseDouble(num));
            }
            else if (num.matches("done")) {
                d = 1;
            }
            else {
                System.out.print("Invalid input. Please input a number");
            }
        } while (d == 0);
        return askNum;
    }


    public Double calcAverage(ArrayList<Double> askNum) {
        //average will add up all elements of the array and then divide by array length
        int length = askNum.size();
        double additionOA = 0;
        double average;
        for (int i = 0; i < length; i++) {
            additionOA += askNum.get(i);
        }
        average = additionOA / length;
        return average;
    }

    public Double calcMax(ArrayList<Double> askNum) {
        //will create a for loop to find the max number
        Collections.sort(askNum);
        return askNum.get(askNum.size()- 1);
    }

    public Double calcMin(ArrayList<Double> askNum) {
        //will create a for loop to find the max number
        Collections.sort(askNum);
        return askNum.get(0);
    }

    public String calcSTD(ArrayList<Double> askNum, double average) {
        //create a for loop that runs and will square the element - mean
        int length  = askNum.size();
        double standardDeviation = 0;

        for(double num: askNum) {
            standardDeviation += Math.pow(num - average, 2);
        }

        Double sqrt = Math.sqrt(standardDeviation/length);
        String sqrtDouble = String.format("%.2f",sqrt);
        //return the sqrt of the std/length
        return sqrtDouble;
    }
}
