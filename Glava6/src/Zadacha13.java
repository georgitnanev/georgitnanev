import java.util.Arrays;
import java.util.Scanner;

public class Zadacha13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i,divider,count = 0;
        int[] a = new int[count -1];

        for ( i = N; i > 1; i/=2) {
            divider = i % 2;
            count++;

        a[i]=divider;

            System.out.println(Arrays.toString(a));

        }
    }
}
