package day11;
import java.util.*;

public class Jumblewords {

    public static String jumbleWordMethod1(String word) {
        StringBuilder oddForward = new StringBuilder();
        StringBuilder evenBackward = new StringBuilder();

        // Pick odd index letters (1-based odd means 0, 2, 4... in 0-based index)
        for (int i = 0; i < word.length(); i += 2) {
            oddForward.append(word.charAt(i));
        }

        // Pick even index letters (1-based even means 1, 3, 5... in 0-based index) from the end backwards
        for (int i = word.length() - 1; i >= 0; i--) {
            if ((word.length() - i) % 2 == 0) { // counting from end
                evenBackward.append(word.charAt(i));
            }
        }

        return oddForward.toString() + evenBackward.toString();
    }

    public static String jumbleWordMethod2(String word) {
        StringBuilder oddForward = new StringBuilder();
        StringBuilder evenForward = new StringBuilder();

        // Pick odd index letters (0, 2, 4...) from start
        for (int i = 0; i < word.length(); i += 2) {
            oddForward.append(word.charAt(i));
        }

        // Pick even index letters (1, 3, 5...) from start
        for (int i = 1; i < word.length(); i += 2) {
            evenForward.append(word.charAt(i));
        }

        return oddForward.toString() + evenForward.toString();
    }

    public static String jumbledSentence(String sentence, int method) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String jumbled;
            if (method == 1) {
                jumbled = jumbleWordMethod1(word);
            } else {
                jumbled = jumbleWordMethod2(word);
            }
            result.append(jumbled).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter method (1 or 2):");
        int method = sc.nextInt();

        String output = jumbledSentence(sentence, method);
        System.out.println("Jumbled Sentence:");
        System.out.println(output);

        sc.close();
    }
}