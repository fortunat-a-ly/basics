package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class FilterIntegersTask implements Task{

    private final List<Object> list;

    public FilterIntegersTask(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object execute() {
        return list.stream().filter(o -> o instanceof Integer).collect(Collectors.toList());
    }
}
