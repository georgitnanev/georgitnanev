import java.util.Scanner;

public class Zadacha2 {
    private static Scanner sc;
    public static void main(String[] args) {

        int number;
        sc = new Scanner(System.in);

        System.out.print("Please Enter a Number That Can Be Divisible By 5 And 7");
        number = sc.nextInt();

        if((number % 5 == 0) && (number % 7 == 0));
        {
            System.out.println("\n Given number " + " is Divisible By 5 and 7");
        }

    }
}
