public class Zadacha2 {

    private int maxSize;
    private int[] stackArray;
    private int count;

    public Zadacha2(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        count = -1;
    }
    public void push(int value) {
        if(!isFull()) {
            count++;
            stackArray[count] = value;

        } else {
            resize(maxSize * 2);
            push(value);
        }

    }
    public int pop() {
        if (!isEmpty()) {
            return stackArray[count--];
        }
        if(count < maxSize /4) {
            resize(maxSize/2);
            return pop();

        } else {
            System.out.println("Empty stack");
            return -1;
        }

    }
    public int peek() {
        if (!isEmpty()) {
            return stackArray[count];
        } else {
            System.out.println("Empty stack, cannot peek");
            return -1;
        }
    }

    private void resize(int newSize) {
        int[] transferArray = new int[newSize];

        for (int i = 0; i < stackArray.length; i++) {
            transferArray[i] = stackArray[i];
            stackArray = transferArray;
        }
        maxSize = newSize;
    }
    public boolean isEmpty() {
        return (count == -1);
    }
    public boolean isFull() {
        return (count+1 == maxSize);
    }



    public static void main(String[] args) {
        Zadacha2 numbers = new Zadacha2(2);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);

        System.out.println("The top is: " +numbers.peek());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.isFull());
        System.out.println(numbers.pop());
        System.out.println("The top now is: " +numbers.peek());

        }

    }

