import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N: ");
        long n = scanner.nextInt();

        int zero = 0;

        for (long i = n-1; i > 0; i--) {
            n *= i;
            System.out.println("N!: " + n);

        }
        do {
            n /= 10;
            zero++;
        } while (n % 10 == 0);
        System.out.println("with " + zero +  " zeroes");



    }
}