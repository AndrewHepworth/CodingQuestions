package arrayProblems.arrayLeftRotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class arrayLeftRotationTest {
    @Test
    @DisplayName("given the input array is empty")
    void givenTheInputArrayIsEmpty() {
        assertArrayEquals(arrayLeftRotation.rotLeft(new int[]{}, 0 ), new int[]{});
    }

    @Test
    @DisplayName("given that the array is")
    void givenThatTheArrayIs() {
        assertArrayEquals(arrayLeftRotation.rotLeft(
                new int[]{1,2,3,4,5},1),
                new int[]{2,3,4,5,1});
    }
}
