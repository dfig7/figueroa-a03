import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isAnagram() {
        Solution24 x = new Solution24();

        boolean actual = x.isAnagram("knit", "tink");
        boolean expected = true;

        assertEquals(expected, actual);
    }
}