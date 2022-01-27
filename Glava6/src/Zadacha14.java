import java.util.Scanner;

public class Zadacha14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reminder;
        int decimal;
        char[] hexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexaValue="";

        System.out.println("Enter number: ");
        decimal = scanner.nextInt();

        while (decimal>0) {
            reminder = decimal % 16;
            hexaValue = hexa[reminder]+hexaValue;
            decimal=decimal/16;
        }
        System.out.println("Hexa value: " + hexaValue);
    }

}
