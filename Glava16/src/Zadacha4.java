import java.util.LinkedList;
import java.util.Queue;

public class Zadacha4 {
    public static void main(String[] args)throws IllegalStateException {
        Queue<Integer> opashka = new LinkedList<Integer>();

        for (int i = 0; i < 5 ; i++)
            opashka.add(i);
            System.out.println("Elements: " + opashka);

            int remove = opashka.remove();
            System.out.println("Remove an element: " +remove);
            System.out.println(opashka);

            int head = opashka.peek();
            if(head> opashka.size())
            throw new NullPointerException("Invalid head of the queue! " + head);

            int size = opashka.size();
            System.out.println("Size of the queue: " + size);

        }

    }


