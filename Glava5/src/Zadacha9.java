import java.util.Scanner;

public class Zadacha9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 999");

        int number = scanner.nextInt();
        int hundreds = (int) (number / 100 | 0);
        int tensAndOnes;

        if (number > 99) tensAndOnes = (int) (number % 100);
        else tensAndOnes = (int) (number * 1);
        {

            switch (hundreds) {
                case 1:
                    System.out.println("Sto");
                    break;
                case 2:
                    System.out.println("Dvesta");
                    break;
                case 3:
                    System.out.println("Trista");
                    break;
            }
            if (hundreds >= 1 && tensAndOnes >= 1)
                System.out.println("i");

            if (tensAndOnes >= 20 && tensAndOnes < 30)
                System.out.println("Dvadeset");
            else if (tensAndOnes >= 30 && tensAndOnes < 40)
                System.out.println("Trideset");
            else if (tensAndOnes >= 40 && tensAndOnes < 50)
                System.out.println("Petdeset");
            {

                switch (tensAndOnes) {
                    case 1:
                        System.out.println("Edno");
                        break;
                    case 2:
                        System.out.println("Dve");
                        break;
                    case 3:
                        System.out.println("Tri");
                        break;
                }
                if (number == 0) {
                    System.out.println("Nula");
                }
            }
        }
    }
}




