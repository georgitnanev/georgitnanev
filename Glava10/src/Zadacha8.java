import java.util.*;

public class Zadacha8 {
    static void printAllSubsetsRecursively(int [] array, int n, Vector<Integer>s ,
                                   int sum)
    {
        if (sum == 0) {
            for (Integer integer : s)
                System.out.print(integer + " ");
            System.out.println();
            return;
        }

        if (n == 0)
            return;

        printAllSubsetsRecursively(array, n - 1, s, sum);
        Vector<Integer> v1=new Vector<>(s);
        v1.add(array[n - 1]);
        printAllSubsetsRecursively(array, n - 1, v1, sum - array[n - 1]);
    }

    static void printAllSubsets(int[] array, int n, int sum)
    {
        Vector<Integer> s= new Vector<>();
        printAllSubsetsRecursively(array, n, s, sum);
    }

    public static void main(String[] args) {
        int[] array = {2,5,8,4,6,11};
        int n = array.length;
        int sum = 11;

        printAllSubsets(array, n, sum);
    }
}

