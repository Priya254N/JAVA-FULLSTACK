package day11;
import java.util.*;

public class Fixformula {

    public static int fixTheFormula(String input1) {
        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        // Extract digits and operators in the order they appear
        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.add(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            }
        }

        // Evaluate expression in order of appearance (no precedence)
        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            int num = numbers.get(i + 1);

            switch (op) {
                case '+':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                case '/':
                    result /= num;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input string:");
        String str = sc.nextLine();

        int ans = fixTheFormula(str);
        System.out.println("Final answer is: " + ans);

        sc.close();
    }
}