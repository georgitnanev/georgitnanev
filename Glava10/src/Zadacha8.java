import java.util.Scanner;

public class Zadacha8 {
    static int subsetSum(int array[], int sum, int n, int s, int count) {
        if (n == 0) {
            if (sum == s) {
                count++;
            }
            return count;
        }
        count = subsetSum(array, n-1, sum,s,count);
        count = subsetSum(array,n-1,sum,s + array[n-1], count);
        return count;
    }

    public static void main(String[] args) {

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
        int n = array.length;
        int s = 0;
        System.out.print(subsetSum(array,n,sum,s, 0));


    }
}
