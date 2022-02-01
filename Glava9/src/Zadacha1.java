import java.util.Scanner;

public class Zadacha1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        printName(name);


    }

    public static void printName(String enterName) {
        System.out.println("Hello, " + enterName + "!");
    }

}
