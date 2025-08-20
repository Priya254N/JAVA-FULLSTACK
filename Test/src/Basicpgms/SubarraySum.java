package Basicpgms;

class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int sum = 12;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return;
                }
            }
        }
        System.out.println("No subarray found");
    }
}