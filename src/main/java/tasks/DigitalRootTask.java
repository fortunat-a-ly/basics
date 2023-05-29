package tasks;

public class DigitalRootTask implements Task {

    private final int i;

    public DigitalRootTask(int i) {
        this.i = i;
    }

    private Integer digitalRoot(int num) {

        int ans = 0;

        while (num > 0) {
            int temp = num % 10;
            ans += temp;
            num /= 10;
        }

        if (ans >= 10) {
            ans = digitalRoot(ans);
        }

        return ans;
    }

    @Override
    public Object execute() {
        return digitalRoot(i);
    }
}
