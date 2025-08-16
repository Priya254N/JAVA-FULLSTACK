package Logicbuildings;
import java.util.*;
public class Stableunstablepassword {
	 // Function to check if a number is stable
    public static boolean isStable(int num) {
        String s = String.valueOf(num);
        Map<Character, Integer> freq = new HashMap<>();

        // Count frequency of each digit
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Get all frequencies
        Set<Integer> uniqueFreq = new HashSet<>(freq.values());

        // If only one unique frequency exists -> Stable
        return uniqueFreq.size() == 1;
    }

    // Function to calculate password
    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] inputs = {input1, input2, input3, input4, input5};
        int sum = 0;

        for (int num : inputs) {
            if (isStable(num)) {
                sum += num;
            }
        }
        return sum;
    }

    // Main function to test
    public static void main(String[] args) {
        // Example input
        int input1 = 12, input2 = 1313, input3 = 122, input4 = 678, input5 = 898;

        int password = findPassword(input1, input2, input3, input4, input5);

        System.out.println("Password = " + password);
    }
}
	
	


    