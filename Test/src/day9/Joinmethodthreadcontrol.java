package day9;
class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

public class Joinmethodthreadcontrol {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();  // Start even thread

        try {
            evenThread.join();  // Wait for evenThread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        oddThread.start();  // Start odd thread after evenThread completes
    }
}


