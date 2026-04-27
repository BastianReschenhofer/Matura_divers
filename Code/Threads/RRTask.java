package Code.Threads;

public class RRTask {
    String name;
    int remainingTime;
    boolean running;
    boolean finished;

    public RRTask(String name, int remainingTime) {
        this.name = name;
        this.remainingTime = remainingTime;
        this.running = false;
        this.finished = false;
    }
}
