public class Zadacha5 {
    public static void positionOfElement(int position, int[] array) {
        if (position > 0 && position < array.length) {
            if (array[position] > array[position + 1]) {
                System.out.println("The position: " + position
                        + " is higher from the next");
            } else {
                System.out.println("The position: " + position
                        + " is lower from the next");
            }
            if (array[position] > array[position - 1]) {
                System.out.println("The position: " + position
                        + " is higher from the previous");
            } else {
                System.out
                        .println("The previous or the last element is ot of array");

            }
        }
        if (position == 0) {
            if (array[position] > array[position + 1]) {
                System.out.println("The position: " + position
                        + " is higher from the next");
            } else {
                System.out.println("The position: " + position
                        + " is lower from the next");
            }
            if (position == array.length) {
                if (array[position] > array[position - 1]) {
                    System.out.println("The position: " + position
                            + " is higher from the previous");
                } else {
                    System.out
                            .println("The previous or the last element is ot of array");
                }
            }
        }
    }

    public static void main(String[] args) {
        int positionOnArray = 1;
        int[] array = { 1, 2, 3, 2, 5, 6, 7, 8, 9, 0 };

        positionOfElement(positionOnArray, array);

    }

}
