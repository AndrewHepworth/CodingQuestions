package stringManipulation.testFrequencyWords;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringManipulation.FrequencyWords.frequencyWords;

import static org.junit.jupiter.api.Assertions.*;

public class testingFrequencyWords {
    @Test
    @DisplayName("simpleInput")
    void simpleInput() {
        assertEquals(frequencyWords.mostFrequentWord(new String[]{"geeks", "for", "geeks"}, 3), "geeks");
        assertEquals(frequencyWords.mostFrequentWord(new String[]{"hello", "world"}, 2), "world");
        assertEquals(frequencyWords.mostFrequentWord(new String[]{"xejdcj"
                , "xejdcj" , "lvjpb" , "tmyuiu" , "lvjpb" , "tmyuiu" , "ovoba" , "lvjpb"
                , "lvjpb" , "fqhyu" , "fqhyu" , "tmyuiu" , "xejdcj" , "tmyuiu" , "fqhyu" ,
                "ovoba" , "xejdcj"}, 17), "tmyuiu");


    }


}
