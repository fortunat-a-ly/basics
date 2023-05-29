package tasks;

public class IpAddressExtraTask implements Task{

    private final long number;

    public IpAddressExtraTask(long number) {
        this.number = number;
    }

    @Override
    public Object execute() {
        return (number >> 24 & 255) + "." +
                (number >> 16 & 255) + "." +
                (number >> 8 & 255) + "." +
                (number & 255);
    }
}
