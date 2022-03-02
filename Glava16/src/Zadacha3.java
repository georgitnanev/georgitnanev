import java.util.ArrayDeque;
import java.util.Deque;



public class Zadacha3 {
    private class Node{
        Object element;
        Node next;
        Node(Object element, Node prevNode) {
            this.element = element;
            prevNode.next = this;
        }
        Node(Object element) {
            this.element = element;
            next = null;
        }
    }
    private Node head;
    private Node tail;
    private int count;

    public Zadacha3() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }
    public void addFirst(Object item) {
        if (head == null) {

            head = new Node(item);
            tail = head;
        } else {

            Node newNode = new Node(item, tail);
            tail = newNode;
        }
        count++;
    }
    public Object removeLast(int index) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException(
                    "Invalid index: " + index);
        }

        int currentIndex = 0;
        Node currentNode = head;
        Node prevNode = null;
        while (currentIndex < index) {
            prevNode = currentNode;
            currentNode = currentNode.next;
            currentIndex++;
        }

        count--;
        if (count == 0) {
            head = null;
            tail = null;
        } else if (prevNode == null) {
            head = currentNode.next;
        } else {
            prevNode.next = currentNode.next;
        }
        return currentNode.element;
    }


    public static void main(String[] args) throws IllegalStateException {
        Deque<Integer>deque = new ArrayDeque<Integer>(10);
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.removeLast();
        System.out.println(deque);

        deque.clear();

        deque.addLast(48);
        System.out.println(deque);
    }

}
