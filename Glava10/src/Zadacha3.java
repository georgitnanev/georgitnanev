import java.util.Scanner;

public class Zadacha3 {

    static String[] wordsArray;
    static void symbolString(int[] array, int index, int begin, int finish) {
        if (index >= array.length) {
            System.out.print("(");
            for (int j = 0; j < array.length; j++) {
                System.out.print("" + wordsArray[array[j]] + " ");
                if (j != array.length - 1)
                    System.out.print(" ");
                }
                    System.out.print("),");
            }
                else
            for (int j = begin; j < finish; j++) {
                array[index] = j;
                symbolString(array, index + 1 , j + 1, finish);
            }
    }
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        wordsArray = new String[length];
        System.out.println();
        for (int j = 0; j < wordsArray.length; j++) {
            System.out.print("strings = " + j);
            wordsArray[j] = scanner.next();
        }
        System.out.println("Enter K: ");
        int k = scanner.nextInt();
        int[] array = new int[k];
        System.out.println(",");
        symbolString(array,0,0,length);
    }
}


