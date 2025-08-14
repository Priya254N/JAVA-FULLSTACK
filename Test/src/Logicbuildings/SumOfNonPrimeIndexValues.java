package Logicbuildings;

public class SumOfNonPrimeIndexValues {

	public int sumOfNonPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (!isPrime(i)) {
                sum += input1[i];
            }
        }
        return sum;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SumOfNonPrimeIndexValues obj = new SumOfNonPrimeIndexValues();
        int[] arr = {10, 20, 30, 40, 50, 60, 70,};
        int length = arr.length;
        int result = obj.sumOfNonPrimeIndexValues(arr, length);
        System.out.println("Sum of values at non-prime indexes: " + result);
    }
}