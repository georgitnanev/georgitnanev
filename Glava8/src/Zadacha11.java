import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 1000, 500, 100, 50, 10, 5, 1 };
        String symbols = "MDCLXVI";

        System.out.print("Enter a roman numeral: ");
        int MAX = 3999;
        Scanner scanner1 = new Scanner(System.in);
        String roman = scanner1.next();
        scanner1.close();

        roman = roman.toUpperCase();

        if (roman.matches(".*[0-9].*") || !roman.matches("[M|D|C|L|X|V|I]*")) {
            System.out.println("Wrong roman numeral");
        }
        int i = 0;
        int current = 0;
        int previous = 0;
        int arabic = 0;

        while (i < roman.length()) {

            char letter = roman.charAt(i);

            switch (letter) {
                case ('I') -> current = 1;
                case ('V') -> current = 5;
                case ('X') -> current = 10;
                case ('L') -> current = 50;
                case ('C') -> current = 100;
                case ('D') -> current = 500;
                case ('M') -> current = 1000;
            }

            if (current > previous) {
                arabic += current - (previous * 2);
            } else {
                arabic += current;
            }
            previous = current;

            i += 1;
        }
        System.out.println("Arabic: " + arabic);

    }
}

