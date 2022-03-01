
public class Zadacha2 {
    public static void main(String[] args) {

            int[] arrayOne = {1,2,3,4};
            int[] arrayTwo = {1,2,3,4};

            boolean arraysEqual = true;
            if (arrayOne.length == arrayTwo.length) {

                for (int i = 0; i <= arrayOne.length-1; i++) {
                    if (arrayOne[i] != arrayTwo[i]) {
                        arraysEqual = false;
                    }
                }
            } else {
                System.out.println("Arrays have different lengths");
                return;
            }
            if (arraysEqual) {
                System.out.println("Arrays are equal: " + arraysEqual);
            } else {
                System.out.println("Arrays are not equal: ");

            }
}
}

