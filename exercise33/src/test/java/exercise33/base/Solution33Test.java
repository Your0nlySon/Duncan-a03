package exercise33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void testRand() {

        Solution33 sol = new Solution33();

        for (int i = 0; i < 1000; i++) {
            int rand = sol.randNumber();
            Boolean valid = false;
            if (rand < 4 && rand >= 0) {
                valid = true;
            }
            assertEquals(true, valid);
        }
    }

}