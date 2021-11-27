package exercise26.base;


public class PaymentCalculator {

    private double Balance;
    private double APR;
    private double MonthlyPayment;

    public int PaymentCalculator(double balance, double apr, double payment) {
        //initialize the variables
        this.Balance = balance;
        this.APR = apr;
        this.MonthlyPayment = payment;

        return calculateMonthsUntilPaidOff();
    }

    public int calculateMonthsUntilPaidOff() {

        APR = APR / 365;
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + Balance / MonthlyPayment * (1 - Math.pow(1 + APR, 30))) / Math.log(1 + APR));

    }
}
