import tasks.Task;

import java.util.Arrays;
import java.util.List;
import tasks.*;

public class App {

    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1, 3, 6, 2, 2, 0, 4, 5);
        List<Task> tasks = List.of(
                new FilterIntegersTask(Arrays.asList(2, "a", "b", 1, 2, -4, "123")),
                new FirstNonRepeatingLetterTask("sTreSS"),
                new DigitalRootTask(942),
                new PairSumLoopTask(arrayList, 5),
                new PairSumStreamTask(arrayList, 5),
                new GuestListTask("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"),
                new BiggestNumberExtraTask(513),
                new BiggestNumberExtraTask(987),
                new IpAddressExtraTask(2149583361L)
        );
        for(Task task : tasks) {
            System.out.println(task.getClass().getName());
            Object obj = task.execute();
            System.out.println("Output: " + obj);
        }
    }
}
