package exercise29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    public void test_validateUserInputTrue() {
        Solution29 sol = new Solution29();

        int userI = 10;

        Double actual_validateUserInputTrue = userInput;
        Double expected_validateUserInputTrue = true;

        assertEquals(expected_validateUserInputTrue, actual_validateUserInputTrue);

    }

}