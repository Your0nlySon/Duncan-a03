package exercise26.base;

/*
    UCF COP3330 Fall 2021 Assignment 3 Solutions
    Copyright 2021 Ethan Duncan
 */

import java.util.Scanner;

public class Solution26 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Solution26 sol = new Solution26();

        //call method 'Balance'
        PaymentCalculator Balance = sol.readGetBalanceFromUser();
        //call method 'APR'
        PaymentCalculator APR = sol.readAPRFromUser();
        //call method 'MonthlyPayment'
        PaymentCalculator MonthlyPayment = sol.readMonthlyPaymentFromUser();

    }

    private PaymentCalculator readGetBalanceFromUser() {
        //ask user for input about get balance, parse, and return it
        return null;
    }

    private PaymentCalculator readAPRFromUser() {
        //ask user for input about APR as a percentage, parse, and return it
        return null;
    }

    private PaymentCalculator readMonthlyPaymentFromUser() {
        //ask user for amount they are going to pay monthly, parse, and return it
        return null;
    }
}
