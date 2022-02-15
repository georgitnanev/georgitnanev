import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadacha8 {
    public static void main(String[] args) throws IOException {
        File fileName = new File("Input.txt");
        Scanner scanner = new Scanner(fileName);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.next());
        }
        scanner.close();


    }
}



