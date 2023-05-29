package tasks;

import java.util.List;

public class PairSumLoopTask implements Task{

    private final List<Integer> arrayList;
    private final int targetSum;
    public PairSumLoopTask(List<Integer> arrayList, int targetSum) {
        this.arrayList = arrayList;
        this.targetSum = targetSum;
    }

    @Override
    public Object execute() {
        int numOfPairs = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) + arrayList.get(j) == targetSum) {
                    numOfPairs++;
                }
            }
        }

        return numOfPairs;
    }
}
