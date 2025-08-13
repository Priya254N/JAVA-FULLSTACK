package Logicbuildings;

public class Stringaddnumber {

	public static String addNumberStrings(String input1, String input2) {
        StringBuilder result = new StringBuilder();
        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? Character.getNumericValue(input1.charAt(i--)) : 0;
            int digit2 = (j >= 0) ? Character.getNumericValue(input2.charAt(j--)) : 0;
            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "98765";
        String num2 = "4321";
        String sum = addNumberStrings(num1, num2);
        System.out.println("Sum: " + sum); 
    }
}