import java.util.Scanner;

public class Zadacha13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean simpleNum = n >= 2;

        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                simpleNum = false;
            }

            if (simpleNum) {
                System.out.println("Simple number");
            } else  {
                System.out.println("Not simple number");
            }


        }


    }
}
