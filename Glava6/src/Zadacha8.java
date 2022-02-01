import java.util.Scanner;

public class Zadacha8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 1;
        double temp = 1;
        double n = scanner.nextInt();
        double x = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            temp *= i / x;
            sum +=temp;

        }
        System.out.println("Result: " + sum);
    }
}

