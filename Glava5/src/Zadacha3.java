import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers");


        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first > second) if (first > third) {
            System.out.println("The greatest number is first. ");
        } else if (first < third)
            System.out.println("The greatest number is third. ");
        else System.out.println("The greatest numbers are first and third");


        if (second > first) if (second > third) {
            System.out.println("The greatest number is second. ");

        } else if (second < third) {
            System.out.println("The greatest number is third");
        } else System.out.println("The greatest numbers are second and third");

        else if (first == second) if (first == third) {
            System.out.println("All are equal. ");
        } else if (first < third) {
            System.out.println("The greatest number is third");
        } else
            System.out.println("The greatest numbers are first and second");
    }   }











