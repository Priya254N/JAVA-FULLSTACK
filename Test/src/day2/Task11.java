package day2;
import java.util.Scanner;
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Largest: " + max);
        sc.close();

	}

}
