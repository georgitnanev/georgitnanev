import java.util.Scanner;

public class Zadacha7 {
    public static void numberInReverse(int num) {
        while (num !=0) {
            System.out.print(num % 10);
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = scanner.nextInt();

        numberInReverse(n);
    }
}
