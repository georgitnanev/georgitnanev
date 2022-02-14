import java.util.List;

public class SumIntsFromFile {
    public static void main(String[] args) throws Exception {

        var ints = FileParser.readIntsFromTxtFile("numberss.text");
        long sum = 0;
        for (int x : ints) {
            sum += x;
        }
        System.out.println("Sum = " + sum);
    }
}
