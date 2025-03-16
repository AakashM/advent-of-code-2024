import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day1 {
    public long solveA(List<List<Integer>> lists) {
        var list1 = lists.stream().map(l -> l.get(0)).sorted().toList();
        var list2 = lists.stream().map(l -> l.get(1)).sorted().toList();

        return IntStream.range(0, list1.size()).mapToLong(idx -> Math.abs(list1.get(idx) - list2.get(idx))).sum();
    }

    public long solveB(List<List<Integer>> lists) {
        var list1 = lists.stream().map(l -> l.get(0)).toList();
        var list2 = lists.stream().map(l -> l.get(1)).toList();

        Map<Integer, List<Integer>> list2Count = list2.stream().collect(
                Collectors.groupingBy(a -> a)
        );

        return list1.stream().mapToLong(i -> i * list2Count.getOrDefault(i, List.of()).size()).sum();
    }
}
