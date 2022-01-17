import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("Enter number: " + a + b);
        }
        
    }
}
