package Logicbuildings;

public class DigitRemovePalindrome {

	public int digitRemove_Palin(int input1) {
        String numStr = String.valueOf(input1);
        if (isPalindrome(numStr)) {
            return -1;
        }
        for (int i = 0; i < numStr.length(); i++) {
            StringBuilder tempStr = new StringBuilder(numStr);
            char removedChar = tempStr.charAt(i);
            tempStr.deleteCharAt(i);
            if (isPalindrome(tempStr.toString())) {
                return Character.getNumericValue(removedChar);
            }
        }
        return -1;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        DigitRemovePalindrome obj = new DigitRemovePalindrome();
        int input = 12331;
        int result = obj.digitRemove_Palin(input);
        System.out.println("Removed digit: " + result);
    }
}