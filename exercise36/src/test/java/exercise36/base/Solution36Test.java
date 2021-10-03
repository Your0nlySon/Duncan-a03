package exercise36.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    @Test
    public void test_average() {
        Solution36 sol = new Solution36();

        Double[] numList = {100.0, 200.0,1000.0,300.0};

        Double actual_AResult = sol.calcAverage(numList);
        Double expected_AResult = 400.0;

        assertEquals(expected_AResult, actual_AResult);
    }
    @Test
    public void test_max() {
        Solution36 sol = new Solution36();

        Double[] numList = {100.0, 200.0,1000.0,300.0};

        Double actual_Amax = sol.calcMax(numList);
        Double expected_Amax = 1000.0;

        assertEquals(expected_Amax, actual_Amax);
    }
    @Test
    public void test_min() {
        Solution36 sol = new Solution36();

        Double[] numList = {100.0, 200.0,1000.0,300.0};

        Double actual_Amin = sol.calcMin(numList);
        Double expected_Amin= 100.0;

        assertEquals(expected_Amin, actual_Amin);
    }
    @Test
    public void test_std() {
        Solution36 sol = new Solution36();

        Double[] numList = {100.0, 200.0,1000.0,300.0};

        Double actual_Astd = sol.calcSTD(numList, 400.0);
        Double expected_Astd = 353.55;

        assertEquals(expected_Astd, actual_Astd);
    }
}