import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i <= 14; i++) {
            if (i != 0) {
                System.out.println();
                for (int j = 1; j <= 4; j++) {

                    switch (i) {
                        case 2:
                            System.out.println("2");
                            break;
                        case 3:
                            System.out.println("3");
                            break;
                        case 4:
                            System.out.println("4");
                            break;
                        case 5:
                            System.out.println("5");
                            break;
                        case 6:
                            System.out.println("6");
                            break;
                        case 7:
                            System.out.println("7");
                            break;
                        case 8:
                            System.out.println("8");
                            break;
                        case 9:
                            System.out.println("9");
                            break;
                        case 10:
                            System.out.println("10");
                            break;
                        case 11:
                            System.out.println("J");
                            break;
                        case 12:
                            System.out.println("Q");
                            break;
                        case 13:
                            System.out.println("K");
                            break;
                        case 14:
                            System.out.println("A");
                            break;
                    }
                    switch (j) {
                        case 1:
                            System.out.println("Spatia");
                            break;
                        case 2:
                            System.out.println("Karo");
                            break;
                        case 3:
                            System.out.println("Kupa");
                            break;
                        case 4:
                            System.out.println("Pika");
                            break;

                    }
                }
            }
            System.out.println();
        }
    }
}
