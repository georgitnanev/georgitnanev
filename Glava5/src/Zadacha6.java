import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            int theBiggestnum = Integer.MIN_VALUE;
            for (int i = 1; i < 5; i++) {
                int num = scanner.nextInt();
                if (num > theBiggestnum) {
                    theBiggestnum = num;
                }
            }
            System.out.println("The biggest number is: " + theBiggestnum);
    }
}
