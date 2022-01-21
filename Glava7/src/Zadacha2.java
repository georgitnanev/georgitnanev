import java.util.Arrays;
import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean arraysEqual = true;
        System.out.println("Enter length of first array: ");
        int length = scanner.nextInt();
        int arrayOne[] = new int[length];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = scanner.nextInt();

            System.out.println("Enter element: " + i);
        }
        System.out.println("Enter length of second array: ");

        if (length != scanner.nextInt()) {
            System.out.println("Arrays have diff lengths");
        } else {

            int arrayTwo[] = new int[length];

            for (int j = 0; j < arrayTwo.length; j++) {
                arrayTwo[j] = scanner.nextInt();
                System.out.println("Enter element: " + j);
            }
            for (int i = 0; i < arrayOne.length; i++) {
                for (int j = 0; j < arrayTwo.length; j++) {


                    if (arrayOne[i] != arrayTwo[j]) {
                        System.out.println("Arrays are not equal");
                        arraysEqual = false;
                        break;
                    } else {
                        System.out.println("Arrays are equal");
                    }
                }
            }
        }
        }

}
