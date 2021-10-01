package exercise26.base;

import java.text.DecimalFormat;

public class PaymentCalculator {

    private double Balance;
    private double APR;
    private double MonthlyPayment;

    PaymentCalculator(double Balance, double APR, double MonthlyPayment) {
        //initialize the variables
        this.Balance = Balance;
        this.APR = APR;
        this.MonthlyPayment = MonthlyPayment;

        calculateMonthsUntilPaidOff();
        new DecimalFormat("#.00").format(calculateMonthsUntilPaidOff());
        System.out.println("It will take " + calculateMonthsUntilPaidOff() + " months to pay it off");
    }

    public double calculateMonthsUntilPaidOff() {
        //create a double called 'numOfMonths' //make it equal to -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double numOfMonths = ((-1/30) * (Math.log(1 + (Balance/MonthlyPayment) * (1 - Math.pow(1 + APR, 30))) / Math.log(1 + APR)));
        //return 'finalNumOfMonths'
        return numOfMonths;
    }

    public double getBalance() {
        return Balance;
    }

    public double getAPR() {
        return APR;
    }

    public double getMonthlyPayment() {
        return MonthlyPayment;
    }
}
