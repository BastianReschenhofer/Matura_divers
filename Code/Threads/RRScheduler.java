package Code.Threads;

import java.util.LinkedList;
import java.util.Queue;

class RRScheduler {
    private Queue<RRWorker> queue = new LinkedList<>();
    private final Object lock = new Object();
    private int quantum;

    public RRScheduler(int quantum) {
        this.quantum = quantum;
    }

    public void addTask(String name, int time) {
        RRTask task = new RRTask(name, time);
        RRWorker worker = new RRWorker(task, lock, quantum);
        queue.add(worker);
        worker.start();
    }

    public void runScheduler() {
        while (!queue.isEmpty()) {
            RRWorker current = queue.poll();

            synchronized (lock) {
                current.getTask().running = true;
                lock.notifyAll();

                while (current.getTask().running) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (!current.getTask().finished) {
                queue.add(current);
            }
        }

        System.out.println("Alle Tasks sind fertig.");
    }
}