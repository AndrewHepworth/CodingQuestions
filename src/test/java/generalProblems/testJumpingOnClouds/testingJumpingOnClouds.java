package generalProblems.testJumpingOnClouds;
import generalProblems.jumpingOnClouds.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testingJumpingOnClouds {
    @Test
    void testSingleJump() {
        System.out.println("Test 1");
    Assertions.assertEquals(Solution.jumpingOnClouds(new int[]{0, 0}), 1);
        System.out.println("Test 2");
        Assertions.assertEquals(Solution.jumpingOnClouds(new int[]{0, 1}), 0);
    }

    @Test
    void testDoubleJump() {
        Assertions.assertEquals(Solution.jumpingOnClouds(new int[]{0,0,0}),1);
        Assertions.assertEquals(Solution.jumpingOnClouds(new int[]{0,0,1}), 1);
    }
}
