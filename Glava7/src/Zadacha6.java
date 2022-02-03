import java.util.Arrays;
import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter K: ");
        int k = scanner.nextInt();

        int sum = array[0];
        int sum2 = 0;
        int a = array[0];

        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element number " + i + " = ");
            array[i] = scanner.nextInt();

         }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("\n");
        System.out.print("Max sum is from elements: ");
        for (int i = n-1; i > k ; i--) {

            System.out.print(array[i]+", ");

        }


    }
}
