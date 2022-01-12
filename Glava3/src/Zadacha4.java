public class Zadacha4 {
    public static void main(String[] args) {
        int numberOne = 3;
        int task = 1 << numberOne;
        int integer = 0;
        int result = integer & task;
        boolean isThirdBit1 = result > 0;
        System.out.println(isThirdBit1);
    }
}
