import java.util.Scanner;

public class Zadacha8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element: " + i+1);
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            int one = array[i];
            for (int j = i+1; j < array.length; j++) {
                int two = array[j];

                if((one + two) == sum)
                    System.out.println("  " +one+ "," +two+"");
            }
        }
    }
}
