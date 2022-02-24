
public class Zadacha4 {
    public static void main(String[] args) {

        for (int i = 2; i <= 14; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i <=10) {
                    System.out.print(i + " ");
                } else {

                    switch (i) {

                        case 11:
                            System.out.print("J ");
                            break;
                        case 12:
                            System.out.print("Q ");
                            break;
                        case 13:
                            System.out.print("K ");
                            break;
                        case 14:
                            System.out.print("A ");
                            break;

                    }
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