import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < 5 ; i++) {
            int number = scanner.nextInt();
            sum += number;

        }

        System.out.println(sum);


    }
}
