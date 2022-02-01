import java.util.Scanner;

public class Zadacha8 {
    public static long fact(long num) {
        long sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;


        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int j = 1; j <= n ; j++) {
            System.out.println(fact(j));

        }
    }
}
