package day2;
import java.util.Scanner;
public class Task1 {

	 public static int add(int a, int b) {
	        while (b != 0) {
	            int carry = a & b;
	            a = a ^ b;
	            b = carry << 1;
	        }
	        return a;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        System.out.println("Sum: " + add(a, b));
	        sc.close();

	}

}
