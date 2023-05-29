package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class GuestListTask implements Task {

    private final String names;

    public GuestListTask(String s) {
        this.names = s;
    }

    @Override
    public Object execute() {
        List<List<String>> sortedNames = Arrays.stream(names.toUpperCase().split(";"))
                .map(fullName -> Arrays.asList(fullName.split(":")))
                .peek(Collections::reverse)
                .sorted(Comparator.comparing((List<String> pair) -> pair.get(0))
                        .thenComparing(pair -> pair.get(1)))
                .collect(Collectors.toList());

        return sortedNames.stream()
                .map(name -> String.format("(%s, %s)", name.get(0), name.get(1)))
                .collect(Collectors.joining());
    }
}
