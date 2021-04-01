package generalProblems.testCountingValleys;

import generalProblems.countingValleys.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testingCountingValleys {
    @Test
    void shouldReturnZero() {
        Assertions.assertEquals(1,1);
        Assertions.assertEquals(Result.countingValleys(4,"UUDD"),0 );
    }

    @Test
    void shouldReturnOne() {
        Assertions.assertEquals(Result.countingValleys(4,"DDUU"), 1);
        Assertions.assertEquals(Result.countingValleys(6, "DUDDUU"),1);
//        Assertions.assertEquals(Result.generalProblems.jumpingOnClouds.countingValleys(8,"DDDDUUUU"), 1);
    }

    @Test
    void checkingCharTest() {
        Assertions.assertEquals(Result.checkChar("DUDDUU",5),1);
    }
}
