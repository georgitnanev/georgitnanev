

public class Zadacha15 {
    static void QuickSort(int array[], int low, int high) {



        int mid = ((low+high)/2);

        int i = low;
        int j = high;
        int pivot = array[mid];

        while(i<=j) {
            while(array[i]<pivot) {
                i++;
            }
            while(array[j]>pivot) {
                j--;
            }
            if(i<=j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low<j)
            QuickSort(array, low, j);
        if (high>i)
            QuickSort(array, i, high);



    }
    public static void main(String[] args) {
        int array[] = {8,7,6,5,4,3,2,7,6,5};
        System.out.println("Before sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+ " ");

        }
        QuickSort(array, 0, array.length - 1);
        System.out.println("After sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+ " ");

        }

    }

}
