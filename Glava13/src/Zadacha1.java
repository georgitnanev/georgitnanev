

public class Zadacha1 {
    public static void main(String[] args) {
        String word = "introduction";
        String reversed = reverseWord(word);
        System.out.println(reversed);

    }
    public static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0 ; i--)
            sb.append(word.charAt(i));
            return sb.toString();

        }

    }

