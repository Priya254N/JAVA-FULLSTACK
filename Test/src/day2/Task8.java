package day2;
import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int result = a >> 1;
        System.out.println(a + " / 2 = " + result);
        sc.close();
	}

}
