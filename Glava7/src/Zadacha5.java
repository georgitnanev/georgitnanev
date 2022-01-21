import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        int maxLength = 1;
        int bestStart = 0;
        int lastElement = 0;
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element: " + i);
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 == array[i+1]) {
                number++;
                if (number > maxLength) {
                    maxLength = number;
                    lastElement = i + 1;
                    bestStart = lastElement - maxLength + 1;
                }
            } else  number = 1;

        }
        for (int i = bestStart; i < maxLength + bestStart; i++) {
            System.out.println(" " + array[i]);

        }


    }

}
