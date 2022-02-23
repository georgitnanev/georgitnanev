public class Zadacha7 {
    public static void main(String[] args) {

        String s =  "one\ttwo\tthree";
        String[] parts = s.split("[\\\\]+");
        for (String a : parts)
            System.out.println(a);

    }
}



