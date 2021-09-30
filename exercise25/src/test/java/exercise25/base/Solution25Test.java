package exercise25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    public void test_passwordValidation() {

        Solution25 sol = new Solution25();
        String uI = new String("1337h@xor!");

        int actual_passwordValidation = sol.seeIfPasswordIsStrong(uI);
        int expected_passwordValidation = 4;

        assertEquals(expected_passwordValidation, actual_passwordValidation);

    }
}