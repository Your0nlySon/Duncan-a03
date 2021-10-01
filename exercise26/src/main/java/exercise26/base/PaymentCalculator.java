package exercise26.base;

public class PaymentCalculator {

    private double Balance;
    private int APR;
    private double MonthlyPayment;

    PaymentCalculator(double Balance, int APR, double MonthlyPayment) {
        //initialize the variables
        this.Balance = Balance;
        this.APR = APR;
        this.MonthlyPayment = MonthlyPayment;
    }

    public int calculateMonthsUntilPaidOff() {
        //create a double called 'numOfMonths'
        //make it equal to -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //change the answer to round up a cent (2 decimals)
        //return 'numOfMonths'
        return 0;
    }

    public double getBalance() {
        return Balance;
    }

    public int getAPR() {
        return APR;
    }

    public double getMonthlyPayment() {
        return MonthlyPayment;
    }
}
