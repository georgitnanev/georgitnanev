import java.util.Scanner;

public class Zadacha12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number on tennumeric");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = num; i > 0; i/= 2) {
            count++;
        }
        int[] array = new int[count];
        int x = (array.length) - 1;
        for (int i = num; i > 0 ; i/= 2) {
            if (i % 2 !=0) {
                array[x] = 1;
                x--;
            } else {
                array[x] = 0;
                x--;
            }

        }
        System.out.println(java.util.Arrays.toString(array));
        for (int b : array) {
            System.out.println(b);
        }
    }
}
