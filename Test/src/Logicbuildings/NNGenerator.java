package Logicbuildings;

public class NNGenerator {

	public int nnGenerator(String input1) {
        StringBuilder result = new StringBuilder();
        int startIndex = 0;
        int n = input1.length();
        while (startIndex < n) {
            int currentSum = 0;
            int firstDigit = Character.getNumericValue(input1.charAt(startIndex));
            boolean firstDigitIsOdd = (firstDigit % 2 != 0);
            int i = startIndex;
            while (i < n) {
                currentSum += Character.getNumericValue(input1.charAt(i));
                if (firstDigitIsOdd) {
                    if (currentSum % 2 == 0) break;
                } else {
                    if (currentSum % 2 != 0) break;
                }
                i++;
            }
            result.append(currentSum);
            startIndex = i + 1;
        }
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        NNGenerator obj = new NNGenerator();
        String input = "12345";
        System.out.println(obj.nnGenerator(input));
    }
}