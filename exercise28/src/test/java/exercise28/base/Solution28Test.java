package exercise28.base;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    public void test_ArrayCalc() {
        Solution28 sol = new Solution28();

        int arr[] = {1,2,3,4,5};

        int actual_testArrayCalc = sol.calcTheSumFromArray(arr);
        int expected_testArrayCalc = 15;

        assertEquals(expected_testArrayCalc, actual_testArrayCalc);
    }

}