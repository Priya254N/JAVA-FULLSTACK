package day9;
class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);  // Set thread name
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(100);  // Small delay to allow context switching
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + " completed.");
    }
}

public class Threadpriority {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread-MIN");
        PriorityThread t2 = new PriorityThread("Thread-NORM");
        PriorityThread t3 = new PriorityThread("Thread-MAX");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority 10

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}


