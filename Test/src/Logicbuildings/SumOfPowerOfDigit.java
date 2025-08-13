package Logicbuildings;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfPowerOfDigit {

    public int SumOfPowerOfDigit(int input1) {
        if (input1 < 10) {
            // As per the assumption, the number will always contain more than 1 digit.
            // If it can be a single digit, the result would be that digit^0 = 1.
            return 1;
        }

        ArrayList<Integer> digits = new ArrayList<>();
        int temp = input1;
        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }
        Collections.reverse(digits);

        int sum = 0;
        for (int i = 0; i < digits.size() - 1; i++) {
            int base = digits.get(i);
            int exponent = digits.get(i + 1);
            sum += Math.pow(base, exponent);
        }

        // Add the power for the last (rightmost) digit, which is raised to 0
        sum += Math.pow(digits.get(digits.size() - 1), 0);

        return sum;
    }

    public static void main(String[] args) {
    	SumOfPowerOfDigit obj = new SumOfPowerOfDigit();
        int input = 1234; // Example input
        int result = obj.SumOfPowerOfDigit(input);
        System.out.println("Sum of powers of digits: " + result);
    }
}

