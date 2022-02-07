import java.util.Arrays;
import java.util.Scanner;

public class Zadacha6 {
    static void Combos(int[] array, int index) {
        if (index == array.length) {
            System.out.print("(");
            for (int j = 0; j < array.length; j++)
                if (j < array.length - 1)
                    System.out.print("" + array[j] + " ");
                else
                    System.out.print(array[j]);
            System.out.print("),");
        } else {
            for (int j = index; j < array.length; j++) {
                int temp = array[j];
                array[j] = array[index];
                array[index] = temp;
                Combos(array, index + 1);
            }
        }
    }

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int j = 0; j < array.length; j++)
            array[j] = j+1;
        Combos(array,0);
    }
}