import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void specialCheck() {
    Solution25 x = new Solution25();

    boolean actual = x.specialCheck("$%");
    boolean expected = true;

    assertEquals(expected, actual);
    }

    @Test
    void testPasswordValidator() {
        Solution25 x = new Solution25();

        int actual = x.passwordValidator("@Dafjef01");
        int expected = 4;
        assertEquals(expected, actual);
    }
}