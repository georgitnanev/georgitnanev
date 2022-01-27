import java.util.Scanner;

public class Zadacha13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Search number");
        int num = scanner.nextInt();
        int[] array = {18,9,8,7,6,5,4,3};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i +1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int currentIndex = 0;
        currentIndex = (firstIndex + lastIndex) / 2;

        while (array[currentIndex] != num && firstIndex <= lastIndex) {
            if (array[currentIndex] > num) {
                lastIndex = currentIndex - 1;
            } else {
                firstIndex = currentIndex + 1;
            }
            currentIndex = ((firstIndex + lastIndex) / 2);
        }
        if (firstIndex <= lastIndex) {
            System.out.println("A " + num + " Element found in location index" + currentIndex );
        } else {
            System.out.println("C");
        }
    }
}
