package stringManipulation.testMakingAnagrams;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringManipulation.makingAnagrams.makingAnagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class testingMakingAnagrams {
    @Test
    @DisplayName("given that the anagram is ab")
    void givenThatTheAnagramIsAb() {

        assertEquals(makingAnagrams.makeAnagram("cde","abc"),4);

    }
}
