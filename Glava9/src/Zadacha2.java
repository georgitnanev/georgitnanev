public class Zadacha2 {
    public static int getMax(int num1, int num2) {
        int max = 0;
        if(num1 > num2) {
            max = num1;

        } else {
            max = num2;
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println("Max num is: "+getMax(8,7));
    }
}
