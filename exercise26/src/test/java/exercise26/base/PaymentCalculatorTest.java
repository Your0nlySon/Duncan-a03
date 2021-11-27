package exercise26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {


    @Test
    public void test_calculateMonthsUntilPaidOff () {
        PaymentCalculator pC = new PaymentCalculator();

        double b = 5000;
        double a = 0.12;
        double p = 100;

        int expected = 70;
        int actual = pC.PaymentCalculator(b, a, p);

        assertEquals(expected, actual);
    }

}