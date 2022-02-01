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
            case 1:
                System.out.println("Last Figure: One"); break;
            case 2:
                System.out.println("Last Figure: Two"); break;
            case 3:
                System.out.println("Last Figure: Three"); break;
            case 4:
                System.out.println("Last Figure: Four"); break;
            case 5:
                System.out.println("Last Figure: Five"); break;
            case 6:
                System.out.println("Last Figure: Six"); break;
            case 7:
                System.out.println("Last Figure: Seven"); break;
            case 8:
                System.out.println("Last Figure: Eight"); break;
            case 9:
                System.out.println("Last Figure: Nine"); break;
            case 0:
                System.out.println("Last Figure: Zero"); break;
            default:
                System.out.println("Last Figure: Invalid entry"); break;
        }
    }
}
