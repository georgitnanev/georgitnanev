import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The greatest number: " + num1);

            if (num2 > num3) {
                System.out.println("The greatest number: " + num2);
            }

        } else {
            System.out.println("The greatest number: " + num3);

            }


    }
}
