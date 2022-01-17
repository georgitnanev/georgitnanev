import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        System.out.printf("%d + %d + %d = %d%n", a, b, c, a + b + c);


    }
}
