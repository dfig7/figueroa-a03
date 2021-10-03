import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateInputValid() {
        Solution27 x = new Solution27();

        String expected = "There were no errors.";
        String actual = x.validateInput("John", "Johnson", "55555", "TK-4321");

        assertEquals(actual, expected);
    }

    @Test
    void validateInputInvalid(){
        Solution27 x = new Solution27();

        String expected = "The first name must be at least 2 characters long. \n" + "The last name must be at least 2 characters long. \n" + "The last name must be filled in. \n" + "The zipcode must be a 5 digit number. \n" +  "The employee ID must be in the format of AA-1234. \n";
        String actual = x.validateInput("J", "", "ABCDE", "A12-1234");

        assertEquals(expected, actual);
    }
}