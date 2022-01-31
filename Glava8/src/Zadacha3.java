import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hex;
        System.out.println("Enter hex number: ");
        hex = scanner.nextLine();

        int decimal;
        decimal = Integer.parseInt(hex, 16);

        System.out.println("Decimal:" +decimal);
    }
}