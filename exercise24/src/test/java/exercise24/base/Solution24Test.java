package exercise24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void test_isAnagram() {
        Solution24 sol = new Solution24();
        String w1 = new String("eye");
        String w2 = new String("yee");

        Boolean actual_isAnagram = sol.seeIfItIsAnagram(w1, w2);
        Boolean expected_isAnagram = true;

        assertEquals(expected_isAnagram, actual_isAnagram);
    }
}