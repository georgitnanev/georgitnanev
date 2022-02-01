import java.util.Scanner;

public class Zadacha4 {
    public static int findNum(int number, int[] str) {
        int counter = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == number) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find num: ");
        int n = scanner.nextInt();
        int[] array = { 1,3,4,5,5,6,7,7,7,5,5,5,5 };

        System.out.println("The num:" + n + " from array was found " + findNum(n, array)+ " times");
    }
}
