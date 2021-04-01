package arrayProblems.countTriplets;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class countTripletsTest {
    @Test
    @DisplayName("testOne")
    void testOne() {
        assertEquals(countTriplets.countTriplet(new int[]{
                14, 3, 6, 8, 11, 16
        }, 6), 3);
    }
}