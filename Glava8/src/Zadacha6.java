import java.util.Scanner;

public class Zadacha6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal, remainder;
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        String hexValue = "";

        System.out.println("Enter number: ");
        decimal = scanner.nextInt();

        while (decimal > 0) {
            remainder = decimal % 16;
            hexValue = hex[remainder] + hexValue;
            decimal = decimal / 16;
        }
        System.out.print("Hex value is: " + hexValue);
        System.out.println("");
    }
}