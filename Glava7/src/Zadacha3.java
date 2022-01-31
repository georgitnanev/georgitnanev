public class Zadacha3 {
    public static void main(String[] args) {
        char[] array = { 'a', 'b', 'c', 'd', 'e' };
        char[] array2 = { 'a', 'b', 'c', 'd' };
        boolean equal = true;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (i < array.length - 1) {
                if (array[i] < array[i + 1]) {
                    count1++;
                } else {
                    break;
                }
            } else {
                break;
            }
            if (i < array2.length - 1) {
                if (array2[i] < array2[i + 1]) {
                    count2++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        System.out.println("Array 1: " + count1+" ");
        System.out.println("Array 2: " + count2+" ");
        if(count1<count2){
            System.out.println("array 1 is first");
        }
        else{
            System.out.println("array2 is first");
        }


    }
}





