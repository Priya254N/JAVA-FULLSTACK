package day9;
class NumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    Thread.sleep(5000); // Delay
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
        }
    }
}

public class Threadcontrol {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberPrinter());
        thread.start();
    }
}


