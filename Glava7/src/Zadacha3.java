import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayOne = new String[] {"a","b","c","d"};
        String[] arrayTwo = new String[] {"a","b","c","d"};
        boolean arraysEqual = true;


        for (int i = 0; i < arrayOne.length; i++) {
        }
            if (arrayOne.length < arrayTwo.length) {
                System.out.println("First array is first");
                arraysEqual = false;
            }
            if (arrayOne.length > arrayTwo.length) {
                System.out.println("Second array is first");
                arraysEqual = false;
            }
            else {
                System.out.println("Arrays are equal");
            }


        }

    }

