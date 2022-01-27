import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int row = 1;
        int col = 0;

        for (col = 0; col < n; col++) {
            System.out.print(" ");
        }

        for (row = row + 1; row <= col + n; row++) {
            if (row < 10) {

                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}



