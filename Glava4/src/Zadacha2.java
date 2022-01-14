import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {

        int r;
        double pi = 3.14,perimeter;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:" + perimeter);

        double area = r * r * pi;
        System.out.println("The area of circle [r = " + r + "]: " + area);
    }

}
