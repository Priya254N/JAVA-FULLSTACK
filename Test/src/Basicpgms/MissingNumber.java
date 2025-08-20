package Basicpgms;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // missing 3
        int n = 5; // numbers should be from 1 to 5

        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int missing = total - sum;
        System.out.println("Missing number: " + missing);
    }
}