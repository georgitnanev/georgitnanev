public class Zadacha3 {
    public static void main(String[] args) {

        boolean equal = true;
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        char[] array2 = {'a', 'b', 'c', 'd','e','f'};

        if (array.length > array2.length)
            System.out.println("Second array is first");
        else if (array.length < array2.length)
            System.out.println("First array is first");
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array2[i]) {
                    System.out.println("First array is first");
                    equal = false;
                    break;
                }
                if (array[i] > array2[i]) {
                    System.out.println("Second array is first");
                    equal = false;
                    break;
                }
            }
            if (equal)
                System.out.println("Arrays are equal");

        }
    }
}



