
public class Zadacha1 {
    private class HelperNode{
        Object index;
        HelperNode next;
        HelperNode(Object index, HelperNode previousNode) {
            this.index = index;
            previousNode.next = this;
        }
        HelperNode(Object index) {
            this.index = index;
            next = null;
        }
    }
    private HelperNode start;
    private HelperNode end;
    private int counter;
    public Zadacha1() {
        this.start = null;
        this.end = null;
        this.counter = 0;
    }
    public void add(Object car) {
        if(start == null) {
            start = new HelperNode(car);
            end = start;
        } else {
            HelperNode newHelperNode = new HelperNode(car,end);
            end = newHelperNode;
        }
        counter++;
    }
    public Object remove(int number) {
        if(number >= counter || number < 0) {
            throw new IndexOutOfBoundsException("Incorrect number! " +number);
        }
        int currNumber = 0;
        HelperNode currNode = start;
        HelperNode previousNode = null;
        while (currNumber < number) {
            previousNode = currNode;
            currNode = currNode.next;
            currNumber++;
        }
        counter--;
        if (counter==0) {
            start = null;
            end = null;
        } else if (previousNode==null) {
            start = currNode.next;
        } else {
            previousNode.next = currNode.next;
        }
        return currNode.index;
    }
    public int remove(Object car) {
        int currNumber = 0;
        HelperNode currNode = start;
        HelperNode previousNode = null;
        while (currNode != null) {
            if ((currNode.index != null && currNode.index.equals(car))
                    || (currNode.index==null) && (car == null)) {
                break;
            }
            previousNode = currNode;
            currNode = currNode.next;
            currNumber++;
        }
        if(currNode != null) {
            counter--;
            if (counter==0) {
                start = null;
                end = null;

            } else if (previousNode == null) {
                start = currNode.next;
            } else {
                previousNode.next = currNode.next;
            }
            return currNumber;
        } else {
            return -1;
        }
    }
    public int indexOf(Object car) {
        int number = 0;
        HelperNode current = start;
        while (current!= null) {
            if((current.index!=null && current.index.equals(car))
                    || current.index==null && (car == null)) {
                return number;
            }
            current = current.next;
            number++;
        }
        return -1;
    }
    public boolean contains(Object car) {
        int number = indexOf(car);
        boolean discovered = (number != -1);
        return discovered;
    }
    public Object elementAt(int number) {
        if(number >= counter || number <0) {
            throw new IndexOutOfBoundsException("Incorrect number! " + number);
        }
        HelperNode currNode = this.start;
        for (int i = 0; i < number; i++) {
            currNode = currNode.next;

        }
        return currNode.index;
    }
    public int getLength() {
        return counter;
    }

    public static void main(String[] args) {
        Zadacha1 listOfCars = new Zadacha1();
        listOfCars.add("Alfa Romeo");
        listOfCars.add("BMW");
        listOfCars.add("Chevrolet");
        listOfCars.add("Daewoo");
        listOfCars.remove(2);
        System.out.println("Available cars: ");
        for (int i = 0; i < listOfCars.getLength(); i++) {
            System.out.println(listOfCars.elementAt(i));

        }
        System.out.println("Are we selling Audi? " + listOfCars.contains("Audi"));
    }

}
