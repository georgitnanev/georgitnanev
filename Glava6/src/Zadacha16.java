import java.util.Random;
import java.util.random.RandomGenerator;

public class Zadacha16 {
    public static void main(String[] args) {
        Random dice = new Random();
        int number;

        for (int count = 1; count <= 10 ; count++) {
            number = 1+dice.nextInt(6);
            System.out.println(number +" ");

        }

    }
}
