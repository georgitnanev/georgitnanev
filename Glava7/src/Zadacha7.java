public class Zadacha7 {
    public static void main(String[] args) {
        int[] array = {9,4,5,4,1,3,1,6,5,9,5,2};


        for (int i = 0; i < array.length; i++) {

            for (int k = 0; k < array.length-i; k++) {
                if (array[i]>array[i+k]) {
                    int a = array[i];
                    array[i] = array[i+k];
                    array[i+k] = a;
                }
            }
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(" " + array[j] + " ");
        }
    }
}
