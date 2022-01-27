import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d,[%d] = ", row, col);
                matrix[row][col] = scanner.nextInt();
            }
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }


