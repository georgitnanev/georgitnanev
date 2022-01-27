import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int nMinusK = n - k;

        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        for (int i = k - 1; i > 0; i--) {
            k *= i;
        }
        for (int i = nMinusK - 1; i > 0; i--) {
                nMinusK *= i;

            }
        System.out.println("Result: " + n * k / nMinusK);

        }

    }


