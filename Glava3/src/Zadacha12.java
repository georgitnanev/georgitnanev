public class Zadacha12 {
    public static void main(String[] args) {

        int n = 35; // 00100011
        int p = 6;
        int v = 0; // 00000001
        int q = 1 << p;

        if (v == 1) {
            n |= q;
        } else
        n &= ~q;

        System.out.println(n);


    }
}
