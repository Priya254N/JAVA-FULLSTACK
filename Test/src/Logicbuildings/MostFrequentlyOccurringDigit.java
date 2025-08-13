package Logicbuildings;

public class  MostFrequentlyOccurringDigit {

    public int MostFrequentlyOccurringDigit(int[] input1, int input2) {
        int[] digitFrequency = new int[10];

        // Count digit frequencies
        for (int i = 0; i < input2; i++) {
            int number = input1[i];
            if (number == 0) {
                digitFrequency[0]++;
                continue;
            }
            while (number > 0) {
                int digit = number % 10;
                digitFrequency[digit]++;
                number /= 10;
            }
        }

        // Find most frequent digit
        int maxFrequency = -1;
        int mostFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i] >= maxFrequency) { // last occurrence wins in tie
                maxFrequency = digitFrequency[i];
                mostFrequentDigit = i;
            }
        }
        return mostFrequentDigit;
    }
}
   