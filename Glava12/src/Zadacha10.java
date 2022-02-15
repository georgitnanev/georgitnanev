public class Zadacha10 {
    public static void main(String[] args) throws Exception {
        var ints = FileParser.readIntsFromTextFile("nums.txt");
        long sum = 0;
        for (int x : ints) {
            sum += x;

        }
        System.out.println("Sum = " + sum);

    }
}
