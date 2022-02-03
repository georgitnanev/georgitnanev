import java.util.Scanner;

public class Zadacha2 {
    public static int getMax(int num1, int num2) {
        int max = 0;
        if(num1 > num2) {
            max = num1;

        } else {
            max = num2;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        System.out.println();


        System.out.println(getMax((getMax(a,b)),c));
    }
}
