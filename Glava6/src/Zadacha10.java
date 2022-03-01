import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");

        int x = scanner.nextInt();
        int[][] array = new int[x][x];
        int countRow = 0;
        for (int i = 0; i < x; i++) {
            countRow++;
            int countCol = countRow;
            for (int j = 0; j < x; j++) {
                array[i][j] = countCol;
                countCol++;

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+ " ");

            }

        }
    }
}

