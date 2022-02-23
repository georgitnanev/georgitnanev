public class Zadacha10 {
    public static void main(String[] args) throws Exception {
        var ints = FileParser.readIntsFromTextFile("C:\\Users\\g.nanev\\IdeaProjects\\georgitnanev\\Glava12\\src\\nums.txt");
        long sum = 0;
        for (int x : ints) {
            sum += x;

        }
        System.out.println("Sum = " + sum);

    }
}
