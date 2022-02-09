import chapter10.Sequence;

public class Zadacha4 {
    public static void main(String[] args) {
        String name = "Cat";

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat(name+ Sequence.nextValue(), "White");
            cat.sayMiau();

        }
        System.out.println();
    }
}
