package day8;
import java.util.Random;
 public class Colordisplay extends Thread {
	String[] colours = {"white","blue","red","orange"};
	Random rand = new Random();
	
	public void run() {
		while (true) {
			int index = rand.nextInt(colours.length);
			String color = colours[index];
			
			System.out.println(Thread.currentThread().getName() + " - Colour: " + color);
			if (color.equals("red")) {
				System.out.println(Thread.currentThread().getName() + " - Found red! Stopping thread.");
				break;
			}
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
	}
	public static void main(String[] args) {
		Colordisplay display = new Colordisplay();
		display.start();
	}
}
