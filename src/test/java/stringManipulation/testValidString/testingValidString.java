package stringManipulation.testValidString;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringManipulation.validString.validString;

import static org.junit.jupiter.api.Assertions.*;

public class testingValidString {
    @Test
    @DisplayName("givenInput")
    void givenInput() {
        assertEquals(validString.isValid("aabbcd"), "NO");
    }

    @Test
    @DisplayName("secondTEst")
    void secondTEst() {
        assertEquals(validString.isValid("abcdefghhgfedecba"), "YES");
    }
    @Test
    @DisplayName("third test")
    void thirdTest() {
        assertEquals(validString.isValid("aaaabbcc"), "NO");
    }


}
