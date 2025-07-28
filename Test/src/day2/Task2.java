package day2;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("One's Complement: " + (~a));
        sc.close();
	}
}
