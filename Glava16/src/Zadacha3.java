import java.util.ArrayDeque;
import java.util.Deque;

public class Zadacha3 {
    public static void main(String[] args) throws IllegalStateException {
        Deque<Integer>deque = new ArrayDeque<Integer>(10);
        deque.add(7);
        deque.add(17);
        deque.add(27);
        deque.add(37);
        deque.add(47);
        deque.removeLast();
        System.out.println(deque);

        deque.clear();

        deque.addFirst(18);
        deque.addFirst(8);

        deque.addLast(48);
        deque.addLast(38);

        System.out.println(deque);
    }

}
