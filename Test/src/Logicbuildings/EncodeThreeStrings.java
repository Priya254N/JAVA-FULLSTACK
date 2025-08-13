package Logicbuildings;

public class EncodeThreeStrings {

    static class Result {
        String output1;
        String output2;
        String output3;

        Result(String o1, String o2, String o3) {
            this.output1 = o1;
            this.output2 = o2;
            this.output3 = o3;
        }
    }

    // rest of your methods...


    public Result EncodeThreeStrings(String input1, String input2, String input3) {
        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        String output1 = parts1[0] + parts2[0] + parts3[0];
        String output2 = parts1[1] + parts2[1] + parts3[1];
        String output3 = parts1[2] + parts2[2] + parts3[2];

        output3 = toggleCase(output3);

        return new Result(output1, output2, output3);
    }

    private String[] splitString(String s) {
        int len = s.length();
        String[] parts = new String[3];
        int remainder = len % 3;
        int baseLen = len / 3;

        if (remainder == 0) {
            parts[0] = s.substring(0, baseLen);
            parts[1] = s.substring(baseLen, 2 * baseLen);
            parts[2] = s.substring(2 * baseLen);
        } else if (remainder == 1) {
            parts[0] = s.substring(0, baseLen);
            parts[1] = s.substring(baseLen, 2 * baseLen + 1);
            parts[2] = s.substring(2 * baseLen + 1);
        } else {
            parts[0] = s.substring(0, baseLen + 1);
            parts[1] = s.substring(baseLen + 1, 2 * baseLen + 1);
            parts[2] = s.substring(2 * baseLen + 1);
        }
        return parts;
    }

    private String toggleCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        EncodeThreeStrings obj = new EncodeThreeStrings();

        // Example input
        String input1 = "abcdef";
        String input2 = "ghijkl";
        String input3 = "mnopqr";

        // Call method
        Result res = obj.EncodeThreeStrings(input1, input2, input3);

        // Print results
        System.out.println("Output 1: " + res.output1);
        System.out.println("Output 2: " + res.output2);
        System.out.println("Output 3: " + res.output3);
    }
}