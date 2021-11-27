package exercise26.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution26 {

    private static final Scanner in = new Scanner(System.in);
    PaymentCalculator pC = new PaymentCalculator();

    public static void main(String[] args) {
        Solution26 sol = new Solution26();

        //call method 'input'
        sol.readInputFromUser();

    }

    private void readInputFromUser() {

        double Balance, APR, MonthlyPayment;

        System.out.print("What is your balance? ");
        Balance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        APR = in.nextDouble();
        APR = APR / 100;

        System.out.print("What is the monthly payment you can make? ");
        MonthlyPayment = in.nextDouble();

        int months = pC.PaymentCalculator(Balance, APR, MonthlyPayment);
        System.out.println("It will take " + months + " months to pay off this card.");
    }

}
