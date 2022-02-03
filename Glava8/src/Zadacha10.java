import java.util.Scanner;

public class Zadacha10 {
    public static int decimal(int binary) {


        Scanner scanner = new Scanner(System.in);
        int dec = 0;
        int n = 0;

        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                dec += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }

        return dec;
    }

    public static void main(String[] args) {
        System.out.println(decimal(1001));
    }
}