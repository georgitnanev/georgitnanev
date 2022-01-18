import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int result = first / second;

        if(result > 0) {
            System.out.println("+");

        }
        if (result < 0) {
            System.out.println("-");
        } else {
            System.out.println("Zero");

        }
    }
}
