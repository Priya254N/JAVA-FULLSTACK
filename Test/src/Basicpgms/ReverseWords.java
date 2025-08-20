package Basicpgms;
class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String[] words = str.split(" ");
        String result = "";

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            result += sb.reverse().toString() + " ";
        }
        System.out.println("Reversed words: " + result.trim());
    }
}
