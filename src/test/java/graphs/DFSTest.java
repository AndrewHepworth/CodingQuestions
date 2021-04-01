package graphs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static graphs.DFS.dfsOfGraph;
import static org.junit.jupiter.api.Assertions.*;

class DFSTest {
     @Test
     @DisplayName("BasicTest")
     void basicTest() {
        //All wrong
         ArrayList<ArrayList<Integer>> testArray = new ArrayList<>();
         testArray.add(new ArrayList<>(Arrays.asList(9,9)));
         testArray.add(new ArrayList<>(Arrays.asList(0, 2)));
         testArray.add(new ArrayList<>(Arrays.asList(0, 5)));
         testArray.add(new ArrayList<>(Arrays.asList(1, 5)));
         testArray.add(new ArrayList<>(Arrays.asList(1, 6)));
         testArray.add(new ArrayList<>(Arrays.asList(1, 8)));
         testArray.add(new ArrayList<>(Arrays.asList(3, 4)));
         testArray.add(new ArrayList<>(Arrays.asList(3, 5)));
         testArray.add(new ArrayList<>(Arrays.asList(4, 7)));
         testArray.add(new ArrayList<>(Arrays.asList(5, 7)));
        assertEquals(dfsOfGraph(10,testArray).toString(),
                "[0, 2, 5, 1, 6, 8, 3, 4, 7]");
     }
}