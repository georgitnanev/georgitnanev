import javax.swing.*;
import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = n -1; i > 0; i--) {
            n *= i;

        }

        for (int i = k -1; i > 0; i--) {
            k *= i;
        }

        System.out.println("N: " +n);
        System.out.println("K: " +k);
        if(1<k&&k<n) {
            System.out.println("N!/K! = " +n/k);
        } else  {
            System.out.println("1<K<N false");
        }
    }
}
