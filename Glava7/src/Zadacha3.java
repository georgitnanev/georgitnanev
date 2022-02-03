public class Zadacha3 {
    public static void main(String[] args) {

        boolean equal = true;
        char[] array = {'a', 'b', 'c', 'e','f'};
        char[] array2 = {'a', 'b', 'c', 'e'};

        int shorterArrayLength = 0;
        if (array.length > array2.length) {
            shorterArrayLength = array2.length;
        } else {
            shorterArrayLength = array.length;
        }


        for (int i = 0; i < shorterArrayLength; i++) {
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
        if (equal) {
           if(array.length==array2.length) {
               System.out.println("Arrays are equal");
           } else if (array.length > array2.length)
            System.out.println("Second array is first");
             else if (array.length < array2.length)
            System.out.println("First array is first");


        }
    }

}


