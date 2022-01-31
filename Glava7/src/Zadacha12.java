import java.util.Scanner;

public class Zadacha12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        System.out.println("Enter a word: ");
        String s = "Great stuff";
        char[] word = s.toCharArray();

        for (int i = 0; i < word.length; i++)
            for (int j = 0; j < alphabet.length; j++)
                if (word[i] == alphabet[j])
                    System.out.println(" "+ j);
    }
}
