import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N: ");
        long n = scanner.nextInt();
        long sum = n;

        for (long i = n; i > 1; i--) {
            sum *= ((i-1));
        }

            n = sum;
            System.out.println(n);

            int zero = 0;
        for (long j = n; j % 5 == 0; j/=5) {
            zero++;

        }

                System.out.println("with " + zero + " zero(es)");


    }

    }
