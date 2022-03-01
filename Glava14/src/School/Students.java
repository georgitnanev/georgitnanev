package School;

public class Students {
    private String fullName;
    private int id;
    private static int counter = 1;

    public Students(String fullName) {
        this.fullName = fullName;
        this.id = id;
        increaseCounter();
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;

    }
    public static int getCounter() {
        return counter;
    }
    public static void increaseCounter() {
        counter++;
    }

    @Override
    public String toString() {
        return "Students{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
