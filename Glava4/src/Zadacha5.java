import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a = ");
        int a = scanner.nextInt();
        System.out.printf("Enter b = ");
        int b = scanner.nextInt();
        int z,i,max;
        z = a -b;
        i = (z>> 31) & 0x1;
        max = a - i * z;
        System.out.println(max + " is the bigger number");




    }
}
