import java.util.Scanner;

public class Zadacha5 {

        public static void merge(int[] array, int left, int mid, int right) {
            int i, j, c = left;
            int[] b = new int[right + 1];

            for (i = left, j = mid + 1; i <= mid && j <= right; c++) {
                if (array[i] <= array[j])
                    b[c] = array[i++];
                else
                    b[c] = array[j++];
            }
            while (i <= mid)
                b[c++] = array[i++];

            while (j <= right)
                b[c++] = array[j++];

            for (i = left; i <= right; i++)
                array[i] = b[i];
        }

        public static void Sort(int[] array, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                Sort(array, left, mid);
                Sort(array, mid + 1, right);
                merge(array, left, mid, right);
            }
        }

        public static void printarray(int[] array) {
            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i] + "  ");
            }

        }

        public static void main(String[] args) {
            int n, res, i;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            int[] array = new int[n];
            System.out.println("Enter " + n + " elements ");
            for (i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("elements in array ");
            printarray(array);
            Sort(array, 0, n - 1);
            System.out.println("\nelements after sorting");
            printarray(array);
        }
    }