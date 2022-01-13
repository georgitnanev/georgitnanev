public class Zadacha11 {
    public static void main(String[] args) {

        int n = 35; // 00100011
        int p = 6;
        int i = 1; // 00000001
        int mask = i << p; // Move the 1st bit with p positions

        // If i & mask are positive then the p-th bit of n is 1
        System.out.println((n & mask) != 0 ? 1 : 0);

    }
}
