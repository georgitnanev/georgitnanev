import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = n - 1; i > 0; i--) {
            n *= i;

        }

        for (int i = k - 1; i > 0; i--) {

        }
        n /= k;
        System.out.println("Result is: " + n);
    }
}
