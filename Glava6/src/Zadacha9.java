import java.util.Scanner;

public class Zadacha9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumNByTwo = n * 2;
        int dividentFact = 1;

        for (int i = sumNByTwo; i > 1 ; i--) {
            dividentFact *= i;
            System.out.println("(2*n)! = " + dividentFact);
        }

            int dividerNPlusOne = n + 1;
            int dividerNPlusOneFact = 1;

            for (int i = dividerNPlusOne; i > 1; i--) {
                dividerNPlusOneFact *=i;
                System.out.println("(n+1)! = " +dividerNPlusOneFact);
            }
            int factN = 1;

            for (int i = n; i > 1; i--) {
                factN *= i;
                System.out.println("n! = " +factN);
            }
            int catalansNumber = dividentFact / (dividerNPlusOneFact * factN);

        System.out.println("CNumber= " +catalansNumber);

        }

        }


