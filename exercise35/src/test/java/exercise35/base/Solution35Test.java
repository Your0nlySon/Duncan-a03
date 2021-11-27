package exercise35.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void testRandString() {
        Solution35 sol = new Solution35();

        ArrayList<String> nameArr = new ArrayList<String>();
        nameArr.add("Heads");
        nameArr.add("Tails");

        int x = 0;
        int y = 0;

        Boolean valid = null;

        for (int i = 0; i < 500; i++) {
            String winner = sol.pickRandWin(nameArr);
            if (winner.matches("Heads")) {
                x += 1;
            }
            else {
                y += 1;
            }
        }
        System.out.println(x);
        System.out.println(y);

        if (x >= 230) {
            valid = true;
        }
        else {
            valid = false;
        }
        assertEquals(true, valid);
    }

}