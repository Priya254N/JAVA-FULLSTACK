package Logicbuildings;

import java.util.*;

public class IdentifyPossibleWords {

    public String IdentifyPossibleWords(String input1, String input2) {
        String[] words = input2.split(":");
        String result = "";
        int underscoreIndex = input1.indexOf('_');
        String lowerInput1 = input1.toLowerCase();

        for (String word : words) {
            if (word.length() == input1.length()) {
                String lowerWord = word.toLowerCase();
                boolean isMatch = true;

                for (int i = 0; i < input1.length(); i++) {
                    if (i != underscoreIndex) {
                        if (lowerInput1.charAt(i) != lowerWord.charAt(i)) {
                            isMatch = false;
                            break;
                        }
                    }
                }

                if (isMatch) {
                    if (!result.isEmpty()) {
                        result += ":";
                    }
                    result += word.toUpperCase();
                }
            }
        }

        if (result.isEmpty()) {
            return "ERROR-009";
        }
        return result;
    }

    public static void main(String[] args) {
    	IdentifyPossibleWords obj = new IdentifyPossibleWords();

        // Example inputs
        String input1 = "b_t";  // Word with underscore
        String input2 = "bat:bet:bit:but:bot";  // Dictionary words

        // Call the method
        String result = obj.IdentifyPossibleWords(input1, input2);

        // Output result
        System.out.println("Possible words: " + result);
    }
}    
    
