package exercise26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {


    @Test
    public void test_calculateMonthsUntilPaidOff () {
        PaymentCalculator info = new PaymentCalculator(5000, 12, 100);

        assertEquals(info.getBalance(), 5000);
        assertEquals(info.getAPR(), 12);
        assertEquals(info.getMonthlyPayment(), 100);
    }

}