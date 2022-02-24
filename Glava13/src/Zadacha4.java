import java.lang.*;
import java.util.Scanner;

public class Zadacha4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(" , , ");
        String text = scanner.nextLine();
        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)) {
                StringBuilder replacement = new StringBuilder();
                for (int i = 0; i < bannedWord.length(); i++) {
                    replacement.append("*");

                }

                text = text.replace(bannedWord, replacement.toString());
            }

        }
        System.out.println(text);
    }
}

