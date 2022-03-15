public class Zadacha1 {
    public static void main(String... args) {

        int value= 8;
        int i = 5;

        switch (value) {
            case 1:
                System.out.print(" one ");
                break;
            case 2:
                System.out.print(" two ");
                break;
            case 3:
                System.out.print(" three ");
                break;
            default:
                System.out.println(" four ");
                for (int k = 0; k < i; k++, System.out.print(k - 'f')) ;
            {
                System.out.println(" End");
            }
        }
    }
}

