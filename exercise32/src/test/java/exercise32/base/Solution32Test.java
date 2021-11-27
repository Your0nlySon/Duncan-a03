package exercise32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void testRandomNumber10() {
        Solution32 sol = new Solution32();

        for (int i = 0; i < 1000; i++) {
            Boolean valid = false;
            int num = sol.getRandNum(1);
            if (num <= 10 && num >= 1) {
                valid = true;
            }
            assertEquals(true, valid);
        }
    }

    @Test
    void testRandomNumber100() {
        Solution32 sol = new Solution32();

        for (int i = 0; i < 1000; i++) {
            Boolean valid = false;
            int num = sol.getRandNum(1);
            if (num <= 100 && num >= 1) {
                valid = true;
            }
            assertEquals(true, valid);
        }
    }

    @Test
    void testRandomNumber1000() {
        Solution32 sol = new Solution32();

        for (int i = 0; i < 1000; i++) {
            Boolean valid = false;
            int num = sol.getRandNum(1);
            if (num <= 1000 && num >= 1) {
                valid = true;
            }
            assertEquals(true, valid);
        }
    }

}