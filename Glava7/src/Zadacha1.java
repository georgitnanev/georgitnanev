import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[20];
        for (int i = 0; i < 20; i++) {
            myArray[i] = i * 5;
            System.out.println("Element " + i + " array num is: " + myArray[i] + ";");


        }
        System.out.println();

    }
}

