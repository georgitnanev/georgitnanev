public class Zadacha10 {


    public static int[] polyMultiplication(int[] arrayOne, int[] arrayTwo, int m, int n) {
        int[] array = new int[(m + n) - 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i + j] = array[i + j] + (arrayOne[i] * arrayTwo[j]);
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int [] arrayOne = {1, 0, 3, 2};
        int [] arrayTwo = {2, 0, 4};
        int m = 4;
        int n = 3;


            }

}








