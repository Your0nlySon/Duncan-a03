package exercise34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    @Test
    public void test_nameRemove() {
        Solution34 sol = new Solution34();

        String userName = new String("John Smith");

        String actual_nameRemove = sol.deleteEmployee(userName);
        String expected_nameRemove = "John Smith";

        assertEquals(expected_nameRemove, actual_nameRemove);
    }

    @Test
    public void test_doesntRemove() {
        Solution34 sol = new Solution34();

        String badUser = new String("Jake Smith");

        String acutal_doesntRemove = sol.deleteEmployee(badUser);
        String expected_nameRemove = "This employee was not apart of the list. Nobody was removed.";

        assertEquals(expected_nameRemove, acutal_doesntRemove);
    }


}