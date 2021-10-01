package exercise27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {
    @Test
    public void test_validateInput() {
        Solution27 sol = new Solution27();
        String firstN = new String("James");
        String lastN = new String("Robinson");
        String zipC = new String("12345");
        String employeeI = new String("AA-1289");

        String actual_validateInput = sol.validateUserInputs(firstN, lastN, zipC, employeeI);
        String expected_validateInput = "There were no errors found.";

        assertEquals(expected_validateInput, actual_validateInput);
    }

}