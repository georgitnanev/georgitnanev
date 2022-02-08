import java.util.Scanner;

public class Zadacha7 {
    static boolean isSubSetSum(int set[], int n, int sum) {
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
        if (set[n - 1] > sum)
            return isSubSetSum(set, n - 1, sum);

        return isSubSetSum(set, n - 1, sum) || isSubSetSum(set, n - 1, sum - set[n - 1]);

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter element: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum = scanner.nextInt();
        if (isSubSetSum(array, array.length, sum) == true) {
            System.out.println("Found a subset with the given sum");
        } else {
            System.out.println("No subset with the given sum");
            System.out.println();
        }
    }
}
