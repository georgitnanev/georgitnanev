import java.lang.*;
import java.util.Scanner;

public class Zadacha4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(" , , ");
        String text = scanner.nextLine();
        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)) {
                String replacement = "";
                for (int i = 0; i < bannedWord.length(); i++) {
                    replacement += "*";

                }

                text = text.replace(bannedWord, replacement);
            }

        }
        System.out.println(text);
    }
}

