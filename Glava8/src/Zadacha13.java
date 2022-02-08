public class Zadacha13 {
    public static void main(String[] args) {

        int bits = Float.floatToIntBits(-0.005f);
        int sign = bits >>> 31;
        int exp = (bits >>> 23 & ((1<<8) -1)) - ((1<<7)-1);
        int m = bits & ((1<<23)-1);
        System.out.println(sign+ " " + exp + " " + m + " " +
                Float.intBitsToFloat((sign<<31) | (exp+((1<<7)-1))<<23 | m));
    }

}
