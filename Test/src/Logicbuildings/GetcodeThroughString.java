package Logicbuildings;

public class GetcodeThroughString {

	public static int getCodeThroughStrings(String input1) {
        String[] words = input1.split(" ");
        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
        }

        while (totalLength >= 10) {
            int sumOfDigits = 0;
            String totalLengthStr = String.valueOf(totalLength);
            for (int i = 0; i < totalLengthStr.length(); i++) {
                sumOfDigits += Character.getNumericValue(totalLengthStr.charAt(i));
            }
            totalLength = sumOfDigits;
        }

        return totalLength;
    }

    public static void main(String[] args) {
        String input = "HELLO WORLD JAVA";
        int code = getCodeThroughStrings(input);
        System.out.println("Code: " + code);
    }
}