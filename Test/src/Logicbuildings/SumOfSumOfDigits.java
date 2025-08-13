package Logicbuildings;

public class SumOfSumOfDigits {

    public int SumOfSumOfDigits(int input1) {
        int totalSum = 0;
        String numberString = String.valueOf(input1);

        while (!numberString.isEmpty()) {
            int currentNumber = Integer.parseInt(numberString);
            int currentSumOfDigits = 0;

            while (currentNumber > 0) {
                currentSumOfDigits += currentNumber % 10;
                currentNumber /= 10;
            }

            totalSum += currentSumOfDigits;

            if (numberString.length() > 1) {
                numberString = numberString.substring(1);
            } else {
                numberString = "";
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        SumOfSumOfDigits obj = new SumOfSumOfDigits();
        int input = 582109;
        int result = obj.SumOfSumOfDigits(input);
        System.out.println("Input: " + input);
        System.out.println("Sum of sums of digits: " + result);
    }
}