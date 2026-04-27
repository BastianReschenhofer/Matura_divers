package Code.Threads;

class RRWorker extends Thread {
    private RRTask task;
    private final Object lock;
    private int quantum;

    public RRWorker(RRTask task, Object lock, int quantum) {
        this.task = task;
        this.lock = lock;
        this.quantum = quantum;
    }

    public RRTask getTask() {
        return task;
    }

    @Override
    public void run() {
        while (!task.finished) {
            synchronized (lock) {
                while (!task.running && !task.finished) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (task.finished) return;

                int work = Math.min(quantum, task.remainingTime);
                System.out.println(task.name + " läuft " + work + " Zeiteinheiten");
                task.remainingTime -= work;

                if (task.remainingTime <= 0) {
                    task.finished = true;
                    System.out.println(task.name + " ist fertig");
                }

                task.running = false;
                lock.notifyAll();
            }
        }
    }
}