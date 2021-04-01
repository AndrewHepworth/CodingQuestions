package arrayProblems.Array2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class Array2DTest {
  @Test
  @DisplayName("when the array is empty")
  void whenTheArrayIsEmpty() {
      assertEquals(Array2D.hourglassSum(new int[][]{{}}), 0);
  }

  @Test
  @DisplayName("given the input array is")
  void givenTheInputArrayIs() {
      assertEquals(Array2D.hourglassSum(
              new int[][]{
                      {1, 1, 1, 0, 0, 0},
                      {0, 1, 0, 0, 0, 0},
                      {1, 1, 1, 0, 0, 0},
                      {0, 0, 2, 4, 4, 0},
                      {0, 0, 0, 2, 0, 0},
                      {0, 0, 1, 2, 4, 0},
              }), 19);
  }


}
