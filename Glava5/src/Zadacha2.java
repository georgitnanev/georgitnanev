import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number < 0) {
            System.out.println("-");
        } else {
            System.out.println("+");

        }
    }
}
