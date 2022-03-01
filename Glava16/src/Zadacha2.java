import java.util.Stack;

public class Zadacha2 {
    public static void main(String[] args) {
        Stack<String> fruit = new Stack<>();
        fruit.push("A.apple");
        fruit.push("B.banana");
        fruit.push("C.cherry");
        fruit.push("D.date");

        System.out.println("Top is: " + fruit.peek());

        while (fruit.size() > 0) {
            String fruitName = fruit.pop();
            System.out.println(fruitName);
        }
    }
}
