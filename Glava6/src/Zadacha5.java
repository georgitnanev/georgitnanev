import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {

        int n;
        int a = 0;
        int b = 1;

        System.out.println("n= ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.print("First " + n + " Fibonacci numbers are: ");
        System.out.println(a + " " +b);

        for (int i = 1; i <= n -2 ; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(" "+sum);
        }


    }
}
