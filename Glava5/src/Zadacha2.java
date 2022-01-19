import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double result = first / second;

        if(first < 0 && second < 0) {
            System.out.println("The result is: +");
        }
        if (first > 0 && second > 0) {
            System.out.println("The result is: +");
        }
        if (first < 0 && second > 0) {
            System.out.println("The result is: -");
        }
        if (first > 0 && second < 0) {
            System.out.println("The result is: -");
        }
    }
}
