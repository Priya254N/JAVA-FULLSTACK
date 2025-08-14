package Logicbuildings;
import java.util.*;
public class AddSubCalculator {

	public int AddSub(int input1, int input2) {
        int result = 0;

        if (input2 == 1) {
            if (input1 % 2 == 0) {
                result = input1 / 2;
            } else {
                result = (input1 + 1) / 2;
            }
        } else if (input2 == 2) {
            if (input1 % 2 == 0) {
                result = (input1 / 2) + input1;
            } else {
                result = ((input1 - 1) / 2) + input1 + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input1: ");
        int input1 = sc.nextInt();
        System.out.print("Enter input2: ");
        int input2 = sc.nextInt();

        AddSubCalculator obj = new AddSubCalculator();
        int result = obj.AddSub(input1, input2);
        System.out.println("Result: " + result);
        sc.close();
    }
}