import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = (int) (b * b - 4 * a * c);

        if (d < 0) {
            System.out.println("\nD=(0)\n, No real roots." + d);
        } else if (d == 0) {

            int x1 = (int) (-b / 2 * a);
            System.out.println("\nX=(0)" + x1);

        } else {
            int x1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
            int x2 = (int) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("\nX=(0)\nX2=(1)" + x2);

        }
    }
}





