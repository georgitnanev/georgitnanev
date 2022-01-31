import java.util.Scanner;

public class Zadacha5 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Binary number: ");
            String binaryString = scanner.nextLine();

            int startValue  = 2;
            int expValue = 0;
            int power = 1;
            int decimalNumber = 0;
            int i = binaryString.length() - 1;

            while (i >= 0) {
                if (binaryString.charAt(i) == '1') {
                    for (int j = 0; j < expValue; j++) {
                        power *= startValue;
                    }
                    decimalNumber += power;
                    power = 1;
                }
                i--;
                expValue++;

            }
            System.out.println("Decimal number: " +decimalNumber);
        }
    }





