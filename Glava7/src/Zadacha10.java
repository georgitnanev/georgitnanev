import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n");
        int n = scan.nextInt();
        if(n>0) {
        int[][] arr = new int[n][n];
        int[][] a = new int[n][n];
        int row;
        int col;

        for (int i = 0; i < n*n; i++) {
            row = i % n;
            col = i / n;
            a[row][col] = i +1;
            }
                System.out.println(a);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the arr[" + i + "][" + j + "]");
            }
            }
            System.out.println();
        }
    }

}


