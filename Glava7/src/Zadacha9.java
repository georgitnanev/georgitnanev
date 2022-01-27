import java.util.Scanner;

public class Zadacha9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sum of numbers: ");
        int n = scanner.nextInt();
        int j = 0;
        int y = 0;
        int sum = 0;
        int bestSum = 0;
        int[] array = {4, 3, 1, 4, 2, 5, 8};


        for (y = -1; y <= array.length - 1; y++) {
            System.out.println();
            sum = 0;

            for (j = y + 1; j < array.length; j++) {
                sum += array[j];
                System.out.println("value: " + array[j]);


                if (sum == n) {
                    bestSum = sum;
                    System.out.println(bestSum);
                    continue;

                }

            }
        }
    }
}