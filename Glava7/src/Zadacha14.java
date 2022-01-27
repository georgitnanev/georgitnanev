import java.util.Scanner;

public class Zadacha14 {
    public static void main(String[] args) {
        int[] array = {8,7,6,5,4,3,2,7,6,5};

        int n = 0;

        int firstOneIndex = 0;
        int firstLastIndex = array.length - 1;
        int position = ((firstOneIndex + firstLastIndex) / 2);
        int oneIndex = 0;
        int lastIndex = position;
        int oneIndexTwo = position + 1;
        int lastIndexTwo = array.length - 1;

        int[] left = new int[position + 1];
        int[] right = new int[array.length - position - 1];
        int countLeft = 0;

        for (int i = oneIndex; i <= lastIndex ; i++) {
            left[countLeft] = array[i];
            countLeft++;
        }
        int countRight = 0;
        for (int i = oneIndexTwo; i <= lastIndexTwo  ; i++) {
            right[countRight] = array[i];
            countRight++;

        }
        System.out.println(java.util.Arrays.toString(array));
        System.out.println(java.util.Arrays.toString(left));
        System.out.println(java.util.Arrays.toString(right));

    }
}
