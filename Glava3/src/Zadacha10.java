import java.util.Scanner;

public class Zadacha10 {
    public static void main(String[] args) {
        int abcd = 1234;
        int a = abcd / 1000 % 10;
        int b = abcd / 100 % 10;
        int c = abcd / 10 % 10;
        int d = abcd % 10;

        System.out.println(a+b+c+d);
        System.out.println("Backwards: dcba. "+(abcd % 10)+(abcd / 10 % 10)
                +(abcd / 100 % 10)+(abcd / 1000 % 10));
        System.out.println("LastNumberFirst: dabc. "+(abcd % 10)+(abcd / 1000 % 10)
                +(abcd / 100 % 10)+(abcd / 10 % 10));
        System.out.println("ExchangeNumberTwoAndThree: acbd. "+(abcd / 1000 % 10)+(c = abcd / 10 % 10)
        +(abcd / 100 % 10)+(abcd % 10));
    }
}
