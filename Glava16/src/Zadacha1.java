import java.util.ArrayList;

public class Zadacha1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(1,7);
        list.remove(0);
        int sum = 0;

        for (Object o : list) {
            Integer result = (Integer) o;
            sum = sum + result;

        }
        System.out.println("Sum is: " + sum);

    }
}
