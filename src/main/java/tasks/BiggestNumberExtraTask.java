package tasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BiggestNumberExtraTask implements Task {

    private final int number;

    public BiggestNumberExtraTask(int number) {
        this.number = number;
    }
    @Override
    public Object execute() {
       String maxNum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        int result = Integer.parseInt(maxNum);

        return result == number ? -1 : result;
    }
}
