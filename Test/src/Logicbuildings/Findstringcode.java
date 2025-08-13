package Logicbuildings;

public class Findstringcode {

    public int Findstringcode(String input1) {
        if (input1 == null || input1.trim().length() == 0) return 0;
        input1 = input1.toUpperCase();
        StringBuilder result = new StringBuilder();
        String[] words = input1.trim().split("\\s+");
        for (String word : words) {
            if (word.length() == 0) continue;
            int sum = 0;
            for (int i = 0; i <= (word.length() - 1) / 2; i++) {
                int first = word.charAt(i) - 'A' + 1;
                int last = word.charAt(word.length() - 1 - i) - 'A' + 1;
                sum += Math.abs(first - last);
            }
            result.append(sum);
        }
        if (result.length() == 0) return 0;
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Findstringcode obj = new Findstringcode();

        // Example input
        String input = "WORLD WIDE WEB";

        // Call the method
        int code = obj.Findstringcode(input);

        // Output result
        System.out.println("String Code: " + code);
    }
}