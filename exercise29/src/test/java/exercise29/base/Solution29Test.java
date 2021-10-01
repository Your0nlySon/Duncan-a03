package exercise29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    public void test_validateUserInputTrue() {
        Solution29 sol = new Solution29();

        int userI = 10;

        Double actual_validateUserInputTrue = sol.calc72(userI);
        Double expected_validateUserInputTrue = 7.0;

        assertEquals(expected_validateUserInputTrue, actual_validateUserInputTrue);

    }

}