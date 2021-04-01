package stringManipulation.testAlternatingCharacters;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringManipulation.removeAllDuplicates.removeAllDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class testingAlternatingCharacters {

    @Test
    @DisplayName("Test name")
    void testName() {
        assertEquals(removeAllDuplicates.removeDuplicates("geeksforgeek"), "gksforgk");
    }
}
