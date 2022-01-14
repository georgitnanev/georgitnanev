import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter x = ");
        int x = input.nextInt();
        System.out.printf("Enter y = ");
            int y = input.nextInt();
            int count = 0;
            if (x % 5 ==0) {
                count++;
            }
            if (y % 5 ==0) {
                count++;
            }
        System.out.println(count + " from entered numbers have remainder 0 divided by 5");


    }
}
