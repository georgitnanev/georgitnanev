import java.util.Scanner;

public class Zadacha8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter points : ");

        int bonusPoints = scanner.nextInt();

        switch (bonusPoints) {
            case 1,2,3: System.out.println("Multiplied by 10 = " +bonusPoints * 10);
            break;
            case 4,5,6: System.out.println("Multiplied by 100 = " +bonusPoints * 100);
            break;
            case 7,8,9: System.out.println("Multiplied by 1000 = " +bonusPoints * 1000);
            break;

            default:
                System.out.println("Error");

        }


    }
}
