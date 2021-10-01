package exercise26.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution26 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution26 sol = new Solution26();

        //call method 'input'
        PaymentCalculator input = sol.readInputFromUser();

    }

    private PaymentCalculator readInputFromUser() {
        //ask user for input about get balance, parse, and return it
        System.out.println("What is your balance? ");
        double balance = Double.parseDouble(in.nextLine());
        System.out.println("What is the APR on the card (as a percent)? ");
        double apr = Integer.parseInt(in.nextLine());
        apr = apr/365;
        System.out.println("What is the monthly payment you can make? ");
        double monthlyPayment = Double.parseDouble(in.nextLine());
        return new PaymentCalculator(balance, apr, monthlyPayment);
    }

}
