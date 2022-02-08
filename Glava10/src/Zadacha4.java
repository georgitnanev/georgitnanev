import java.util.Scanner;

public class Zadacha4 {
    public static String[] strings, str;
    public static int length;


    public static void cycle(int iteration, int index, int k) {
        if (iteration == k) {
            for (int i = 0; i < length; i++)
                System.out.print("()" + str[i]);
            return;
        }
        for (int i = index; i < strings.length; i++) {
            str[iteration] = strings[i];
            cycle(iteration + 1, i + 1, k);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words length: ");
        length = scanner.nextInt();

        strings = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter word: " +i+1);
            strings[i] = scanner.next();

        }
        for (int i = 0; i < length; i++) {
            str = new String[length];
            cycle(0, 0, i);

        }

    }
}







