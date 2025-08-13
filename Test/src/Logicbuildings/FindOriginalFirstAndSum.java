package Logicbuildings;

public class FindOriginalFirstAndSum {
	public int output1;
	public int output2;
	
	public FindOriginalFirstAndSum(int output1, int output2) {
	        this.output1 = output1;
	        this.output2 = output2;
	    }

	    public static FindOriginalFirstAndSum calculate(int[] input1, int input2) {
	        int n = input2;
	        int[] originalArray = new int[n];
	        originalArray[n - 1] = input1[n - 1];

	        for (int i = n - 2; i >= 0; i--) {
	            originalArray[i] = input1[i] - originalArray[i + 1];
	        }

	        int sumOfOriginalArray = 0;
	        for (int i = 0; i < n; i++) {
	            sumOfOriginalArray += originalArray[i];
	        }

	        int firstNumber = originalArray[0];
	        return new FindOriginalFirstAndSum(firstNumber, sumOfOriginalArray);
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 9, 12}; 
	        FindOriginalFirstAndSum res = calculate(arr, arr.length);

	        System.out.println("First Number: " + res.output1);
	        System.out.println("Sum: " + res.output2);
	    }
	}

	