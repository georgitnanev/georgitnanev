import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;

        System.out.println("Enter the number of numbers: ");
        int number = scanner.nextInt();

        System.out.println("Enter a few numbers: ");
        for (int i = 0; i < number; i++) {
            int n = scanner.nextInt();
            if (i==0) { smallest = n; largest = n; }
            if (n < smallest) smallest = n;
            if (n > largest) largest = n;
        }
        System.out.println("\n"+"Smallest: "+smallest);
        System.out.println("Largest: "+largest);

    }
}
