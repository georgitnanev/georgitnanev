import java.util.Scanner;

public class Zadacha9 {
    public static void main(String[] args) {

        int[] hexNum = new int[100];
        int k = 1, m = 0, a, decNum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary num: ");
        int binaryNum = scanner.nextInt();
        while (binaryNum > 0) {
            a = binaryNum % 2;
            decNum=decNum+a*k;
            k = k * 2;
            binaryNum = binaryNum / 10;

        }
        k = 0;
        while (decNum != 0) {
            hexNum[k]=decNum % 16;
            decNum = decNum/16;
            k++;
        }
        System.out.println("Hex num is: ");
        for (m = k-1; m >= 0; m--) {
            if (hexNum[m]>9) {

                System.out.print((char)(hexNum[m]+55));
            } else {
                System.out.print(hexNum[m]);
            }

        }
        System.out.println();

    }
}
