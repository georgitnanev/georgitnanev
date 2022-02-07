import java.util.Scanner;

public class Zadacha12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";
        System.out.println("Enter Arabic num: ");
        int i = scanner.nextInt();
        int thousands = i / 1000;
        int hundreds = (i / 100) % 10;
        int tens = (i / 10) % 10;
        int ones = i % 10;

        switch (thousands) {
            case 1 -> result += "M";
            case 2 -> result += "MM";
            case 3 -> result += "MMM";
        }

        switch (hundreds) {
            case 1 -> result += "C";
            case 2 -> result += "CC";
            case 3 -> result += "CCC";
            case 4 -> result += "CD";
            case 5 -> result += "D";
            case 6 -> result += "DC";
            case 7 -> result += "DCC";
            case 8 -> result += "DCCC";
            case 9 -> result += "CM";
        }

        switch (tens) {
            case 1 -> result += "X";
            case 2 -> result += "XX";
            case 3 -> result += "XXX";
            case 4 -> result += "XL";
            case 5 -> result += "L";
            case 6 -> result += "LX";
            case 7 -> result += "LXX";
            case 8 -> result += "LXXX";
            case 9 -> result += "XC";
        }

        switch (ones) {
            case 1 -> result += "I";
            case 2 -> result += "II";
            case 3 -> result += "III";
            case 4 -> result += "IV";
            case 5 -> result += "V";
            case 6 -> result += "VI";
            case 7 -> result += "VII";
            case 8 -> result += "VIII";
            case 9 -> result += "IX";
        }
        System.out.println("Roman num is: " +result);
    }

}
