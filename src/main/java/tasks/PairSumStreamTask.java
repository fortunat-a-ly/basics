package tasks;

import java.util.List;
import java.util.stream.IntStream;

public class PairSumStreamTask implements Task{

    private final List<Integer> arrayList;
    private final int targetSum;

    public PairSumStreamTask(List<Integer> arrayList, int targetSum) {
        this.arrayList = arrayList;
        this.targetSum = targetSum;
    }


    @Override
    public Object execute() {
        return IntStream.range(0, arrayList.size())
                .map(x -> (int) IntStream.range(x + 1, arrayList.size())
                        .filter(y -> arrayList.get(x) + arrayList.get(y) == targetSum)
                        .count())
                .sum();
    }
}
