import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        System.out.print("Enter M: ");
        int m = scanner.nextInt();

        int array[][] = new int[n][m];
        int countRow = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Enter array[" +i+ "][" +j+ "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                System.out.printf(" %d ",array[row][col]);

            }

        }
    }
}

