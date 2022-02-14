import java.util.Scanner;

public class Zadacha4 {
    static String[] strings, str;
    static int length;


    static void cycle(int iter, int index, int k) {
        if (iter == k) {
            for (int i = 0; i < length; i++)
                System.out.print(" " + str[i]);
            return;
        }


            for (int i = index; i < strings.length; i++) {
                str[iter] = strings[i];
                cycle(iter + 1, i + 1, k);
            }

        }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter words length: ");
        length = scanner.nextInt();

        strings = new String[length];

        for (int i = 0; i < length; i++)
        {
            System.out.print("Enter word: " + i + 1);
            strings[i] = scanner.next();
        }

        for (int i = 0; i <= length; i++)
        {
            str = new String[length];
            cycle(0, 0, i);
        }
    }
}















