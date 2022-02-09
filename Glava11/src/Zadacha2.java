import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a : ");
        int a = scanner.nextInt();
        System.out.println("Enter side b : ");
        int b = scanner.nextInt();

        System.out.println("Hypotenuse is: " +Math.sqrt((Math.pow(a,2)+ Math.pow(b,2))));
    }
}
