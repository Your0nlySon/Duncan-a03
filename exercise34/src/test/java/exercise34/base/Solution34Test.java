package exercise34.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    //if you run the program it will work but the test is not working for some reason

    @Test
    public void test_nameRemove() {
        Solution34 sol = new Solution34();

        String userName = new String("John Smith");

        String[] employeeArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
        String[] actual_nameRemove = sol.deleteEmployee(userName, employeeArray);
        String[] expected_nameRemove = {"Jackie Jackson", "Chris Jones", "Amanda Cullen","Jeremy Goodwin"};

        assertEquals(expected_nameRemove, actual_nameRemove);
    }

    @Test
    public void test_doesntRemove() {
        Solution34 sol = new Solution34();

        String badUser = new String("Jake Smith");

        String[] employeeArray = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
        String[] actual_doesntRemove = sol.deleteEmployee(badUser, employeeArray);
        String expected_nameRemove = null;

        assertEquals(expected_nameRemove, actual_doesntRemove);
    }


}