import java.util.Scanner;

public class Zadacha3 {
    public static int lastNum (int num) {
        int countNum = num % 10;
        return countNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = scanner.nextInt();

        switch (lastNum(n)) {
            case 1 -> System.out.println("Last Figure: One");
            case 2 -> System.out.println("Last Figure: Two");
            case 3 -> System.out.println("Last Figure: Three");
            case 4 -> System.out.println("Last Figure: Four");
            case 5 -> System.out.println("Last Figure: Five");
            case 6 -> System.out.println("Last Figure: Six");
            case 7 -> System.out.println("Last Figure: Seven");
            case 8 -> System.out.println("Last Figure: Eight");
            case 9 -> System.out.println("Last Figure: Nine");
            case 0 -> System.out.println("Last Figure: Zero");
            default -> System.out.println("Last Figure: Invalid entry");
        }
    }
}
