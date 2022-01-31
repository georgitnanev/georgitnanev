import java.util.Locale;
import java.util.Scanner;

public class Zadacha8 {
    public static int hextobinary(String dig) {
        String hexd;
        int m, num=0;
        char letter;
        hexd="0123456789ABCDEF";
        dig=dig.toUpperCase(Locale.ROOT);
        num=0;
        for (int j = 0; j < dig.length(); j++) {
            letter=dig.charAt(j);
            m=hexd.indexOf(letter);
            num=16*num+m;
        }
        return num;
    }
    public static void main(String[] args) {
        String hnum;
        int dnum, k=1,d;
        int bnum[] = new int[50];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hex num: ");
        hnum = scanner.nextLine();
        dnum = hextobinary(hnum);
        while (dnum !=0) {
            bnum[k++]=dnum % 2;
            dnum=dnum/2;
        }
        System.out.println("Binary num: ");
        for (d = k-1; d > 0; d--) {
            System.out.print(bnum[d]);

        }
        System.out.println(" ");

    }
}
