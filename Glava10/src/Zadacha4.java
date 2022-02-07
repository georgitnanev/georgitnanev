import java.util.Scanner;

public class Zadacha4 {
    public static String[] strings, stringOne;
    public static int length;


    public static void cycle(int iter, int subject, int k) {
        if (iter == k) {
            for (int i = 0; i < length; i++)
                System.out.print("()" + stringOne[i]);
            return;

        }
        for (int i = subject; i < strings.length; i++) {
            stringOne[iter] = strings[i];
            cycle(iter + 1, i + 1, k);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words length: ");
        length = scanner.nextInt();

        strings = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter word: ");
            strings[i] = scanner.next();

        }
        for (int i = 0; i < length; i++) {
            stringOne = new String[length];
            cycle(0, 0, i);

        }

    }
}







