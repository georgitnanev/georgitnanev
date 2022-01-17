import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("max = " + max);


    }
}