import java.util.Scanner;

public class Zadacha2 {
    static void Combos(int[] array, int index, int begin, int finish) {
        if (index == array.length) {
            System.out.print("(");
            for (int j = 0; j < array.length; j++)
                if (j < array.length - 1)
                    System.out.print("" +array[j]+ " ");
                else
                    System.out.print(array[j]);
            System.out.print("),");
        } else
            for (int j = begin; j <= finish; j++) {
                array[index] = j;
                Combos(array, index+1 , j, finish);
            }
    }
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        System.out.println("Enter K: ");
        int k = scanner.nextInt();
        int[] array = new int[k];
        Combos(array,0,1,n);
    }
}