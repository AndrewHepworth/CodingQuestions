package stringManipulation.testRemoveAllDuplicates;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringManipulation.removeAllDuplicates.removeAllDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class testingRemoveAllDuplicates {
    @Test
    @DisplayName("simpleInput")
    void simpleInput() {
        assertEquals(removeAllDuplicates.removeDuplicatesTwo("aaabbcc"),"abc");
    }


}
