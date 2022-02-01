public class Zadacha6 {
    public static int firstBigElements(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                index = i;
                break;
            }
            else{
                index=0;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = { 3, 2, 1, 8, 6, 1, 1, };

        System.out.println("The index of array which is bigger from the previous and the next is: " + firstBigElements(array));

    }

}

