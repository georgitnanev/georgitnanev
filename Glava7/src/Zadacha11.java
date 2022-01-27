import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter m: ");
        int m = scanner.nextInt();

        int sumOfSubMatrix = 0;

        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int ii = 0; ii < m; ii++) {
                System.out.println("Enter matrix ["+ i +"][" + ii + "]");
                matrix[i][ii] = scanner.nextInt();

            }

        }
        int currentSum = 0;
        int bestSum = 0;
        int bestRow = 0;
        int bestCol = 0;

        int y = 0;
        int x = 0;

        for (x = 0; x < n - 2; x++) {
            for (y = 0; y < m - 2; y++) {
                currentSum = matrix[x][y] + matrix[x][y + 1] + matrix[x][y + 2]
                        + matrix[x + 1][y] + matrix[x + 1][y + 1]
                        + matrix[x + 1][y + 2] + matrix[x + 2][y]
                        + matrix[x + 2][y + 1] + matrix[x + 2][y + 2];
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                System.out.println("Matrix [" + x + "][" + y + "]:"
                        + matrix[x][y]);
                System.out.println("Matrix [" + x + "][" + y + "+1]:"
                        + matrix[x][y + 1]);
                System.out.println("Matrix [" + x + "+1][" + y + "]:"
                        + matrix[x + 1][y]);
                System.out.println("Matrix [" + x + "+1][" + y + "+1]:"
                        + matrix[x + 1][y + 1]);
                System.out.println("Matrix [" + x + "+2][" + y + "]:"
                        + matrix[x + 2][y]);
                System.out.println("Matrix [" + x + "+2][" + y + "+1]:"
                        + matrix[x + 2][y + 1]);
                System.out.println("Matrix [" + x + "+2][" + y + "+2]:"
                        + matrix[x + 2][y + 2]);
                System.out.println("Sum: " + currentSum);
            }
            if (currentSum> bestSum) {
                bestSum = currentSum;
                bestRow = x;
                bestCol = y;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.println("%d " + matrix[row][col]);
            }
            System.out.println();

                }
                System.out.println("Best sum: " + bestSum);
                System.out.println("Max X: " + x);
                System.out.println("MAx Y: " + y);
                System.out.println();
                for (int row = x - 2; row < matrix.length ; row++) {
                    for (int col = y - 2; col < matrix[0].length; col++) {

                        System.out.printf("%d " + matrix[row][col]);
                    }
                    System.out.println();

                }


            }

        }

    }

}
