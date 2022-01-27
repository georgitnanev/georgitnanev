import java.util.Scanner;

public class Zadacha16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        System.out.println("Enter prime limit: ");
        N = scanner.nextInt();
        scanner.close();

        boolean[] isPrime = new boolean[N];
        isPrime[0] = false;
        for (int c = 1; c < N; c++) {
            isPrime[c] = true;
            }
        for (int i = 2; i <= N ; i++) {
            if (isPrime[i-1]) {
                System.out.println(i);
                for (int j = i*i; j <= N; j+=i) {
                    isPrime[j-1] = false;
                }
        }

        }
    }
}
