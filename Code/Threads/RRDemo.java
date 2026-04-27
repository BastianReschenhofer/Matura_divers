package Code.Threads;

public class RRDemo {
    public static void main(String[] args) {
        RRScheduler scheduler = new RRScheduler(2);

        scheduler.addTask("P1", 5);
        scheduler.addTask("P2", 3);
        scheduler.addTask("P3", 7);

        scheduler.runScheduler();
    }
}
