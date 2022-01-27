import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int weightNumber;

        System.out.println("Enter number: ");
         weightNumber = input.nextInt();


        System.out.println("How much do I weigh on the Moon:" + ((float) weightNumber * 17 / 100f));


    }
}
