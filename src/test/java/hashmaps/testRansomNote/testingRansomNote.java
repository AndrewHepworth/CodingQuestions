package hashmaps.testRansomNote;

import hashmaps.ransomNote.ransomNote;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class testingRansomNote {
    @Test
    @DisplayName("sampleInput")
    void sampleInput() {
        assertEquals(ransomNote.checkMagazineTwo(new String[]{"two",
        "times", "three" , "is" , "not", "four"},
                new String[]{"two", "times" , "two", "is", "four"}),"No");
    }
}
