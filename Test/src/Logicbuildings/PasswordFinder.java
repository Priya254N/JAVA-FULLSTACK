package Logicbuildings;
import java.util.*;

public class PasswordFinder {

    public int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int stableSum = 0;
        int unstableSum = 0;

        int[] numbers = {input1, input2, input3, input4, input5};

        for (int number : numbers) {
            if (isStable(number)) {
                stableSum += number;
            } else {
                unstableSum += number;
            }
        }

        return stableSum - unstableSum;
    }

    private boolean isStable(int num) {
        if (num < 0) {
            num = -num;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        String numStr = String.valueOf(num);

        for (char c : numStr.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (frequencyMap.containsKey(digit)) {
                frequencyMap.put(digit, frequencyMap.get(digit) + 1);
            } else {
                frequencyMap.put(digit, 1);
            }
        }

        if (frequencyMap.isEmpty()) {
            return true;
        }

        int firstFrequency = -1;
        for (int frequency : frequencyMap.values()) {
            if (firstFrequency == -1) {
                firstFrequency = frequency;
            } else if (firstFrequency != frequency) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PasswordFinder obj = new PasswordFinder();
        int result = obj.findPassword(122, 1313, 444, 7676, 989);
        System.out.println(result);
    }
}
