package Logicbuildings;

public class GenerateSeries {

	public int seriesN(int input1, int input2, int input3, int input4) {
        int a = input1;
        int b = input2;
        int c = input3;
        int n = input4;

        int gap1 = b - a;
        int gap2 = c - b;

        int current = c;
        for (int i = 3; i < n; i++) {
            if (i % 2 != 0) {
                current += gap1;
            } else {
                current += gap2;
            }
        }

        if (n == 1) {
            return a;
        } else if (n == 2) {
            return b;
        } else if (n == 3) {
            return c;
        } else {
            return current;
        }
    }

    public static void main(String[] args) {
    	GenerateSeries sc = new GenerateSeries();
        int result = sc.seriesN(2, 4, 6, 7);
        System.out.println("The nth term is: " + result);
    }
}