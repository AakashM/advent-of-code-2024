import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Day1Test {
    @Test
    void solveExampleA() {
        long output = new Day1().solveA(readInput("day1-example.txt"));
        Assertions.assertEquals(11, output);
    }

    @Test
    void solveInputA() {
        long output = new Day1().solveA(readInput("day1-input.txt"));
        Assertions.assertEquals(1590491, output);
    }

    @Test
    void solveExampleB() {
        long output = new Day1().solveB(readInput("day1-example.txt"));
        Assertions.assertEquals(31, output);
    }

    @Test
    void solveInputB() {
        long output = new Day1().solveB(readInput("day1-input.txt"));
        Assertions.assertEquals(22588371, output);
    }

    List<List<Integer>> readInput(String filename) {
        return TestUtil.readInput(filename).stream().map(str -> {
            String[] parts = str.split("   ");
            return List.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
        }).toList();
    }
}
