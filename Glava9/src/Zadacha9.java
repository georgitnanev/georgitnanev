import java.util.Scanner;

public class Zadacha9 {

    public static void reverseNumber(int number) {
        if (number < 0) {
            System.out.println("Enter positive number");
            return;
        }
        while (number != 0) {
            System.out.print(number % 10);
            number = number / 10;
        }

    }

    public static void averageSum(double[] numbers) {
        if (numbers.length <= 0) {
            System.out.println("Please enter the length and the numbers");
            return;
        }
        double sum = 0;
        double avr = 0;
        for (double num : numbers) {
            sum += num;
        }
        sum = sum / numbers.length;
        System.out.println("The average sum is: " + sum);
    }

    public static void linearEquation(int a, int b) {
        if (a == 0) {
            System.out.println("A is different from 0");
        }
        int x;
        // a * x + b = 0.
        x = -b / a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);
        System.out.println((a * x + b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose what program you like run");
        System.out.println("Press 1 - reverse number");
        System.out.println("Press 2 - Average sum");
        System.out.println("Press 3 - Linear Equation ( a * x + b = 0)");
        int n = scan.nextInt();
        if (n < 1 || n > 3) {
            System.out.println("Enter number between 1 and 3");
            n = scan.nextInt();
        }
        switch (n) {
            case 1:
                System.out.print("Enter number: ");
                int z = scan.nextInt();
                reverseNumber(z);
                break;
            case 2:
                System.out.println("Enter the length: ");
                int y = scan.nextInt();
                double[] num = new double[y];
                for (int a = 0; a < y; a++) {
                    System.out.print("Enter " + a + " position");
                    num[a] = scan.nextInt();
                }
                averageSum(num);
                break;
            case 3:
                System.out.println("Enter a");
                int number1 = scan.nextInt();
                System.out.println("Enter b");
                int number2 = scan.nextInt();
                linearEquation(number1, number2);
                break;
            default:
                System.out.println("Wrong try");
        }
    }
}
