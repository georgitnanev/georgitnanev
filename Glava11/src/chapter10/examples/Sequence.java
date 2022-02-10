package chapter10.examples;

public class Sequence {
    private static int currentValue = -1;

    private Sequence() {

    }

    public static int nextValue() {
        currentValue++;
        return currentValue;
    }



    public static void main(String[] args) {
        System.out.printf("Sequence[1..3]: %d, %d, %d%n",
                chapter10.Sequence.nextValue(), chapter10.Sequence.nextValue(),
                chapter10.Sequence.nextValue());
    }
}
