

public class Zadacha4 {
    private int capacity;
    int queueArray[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public Zadacha4(int queueSize) {
        this.capacity = queueSize;
        queueArray = new int[this.capacity];
    }

    public void offer(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow state. Increase capacity.");
            increaseCapacity();
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArray[rear] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue.");
        }
    }

    public void poll() {
        if (isQueueEmpty()) {
            System.out.println("Underflow state.");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println("Removed element: " + queueArray[front - 1]);
                front = 0;
            } else {
                System.out.println("Removed element: " + queueArray[front - 1]);
            }
            currentSize--;
        }
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    private void increaseCapacity() {
        int newCapacity = this.queueArray.length * 2;
        int[] newArr = new int[newCapacity];
        int tmpFront = front;
        int index = -1;
        while (true) {
            newArr[++index] = this.queueArray[tmpFront];
            tmpFront++;
            if (tmpFront == this.queueArray.length) {
                tmpFront = 0;
            }
            if (currentSize == index + 1) {
                break;
            }
        }
        this.queueArray = newArr;
        System.out.println("New array capacity: " + this.queueArray.length);
        this.front = 0;
        this.rear = index;
    }

    public static void main(String args[]) {
        try {
            Zadacha4 queue = new Zadacha4(10);
            queue.offer(1);
            queue.poll();
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            queue.offer(5);
            queue.offer(6);
            queue.poll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





