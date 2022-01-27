import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bestStart = 1;
        int maxLength = 1;
        int number = 0;
        System.out.println("Enter array length: ");

        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element: " + i);
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                maxLength++;
            } else {
                maxLength = 1;

            } if (maxLength > bestStart) {
                bestStart = maxLength;
                number = array[i];
            }

        }
        for (int i = 0; i < bestStart; i++) {
            System.out.println(" " + number);

        }
    }
}
