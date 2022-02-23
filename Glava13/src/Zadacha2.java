public class Zadacha2 {


    public static void numOfIndex(String pieceOfText, String preposition) {
        int index = 0;
        int counter = 0;
        index = pieceOfText.indexOf(preposition);

        while (index != (-1)) {
            index = pieceOfText.indexOf(preposition,index+1);
            counter++;
        }
        System.out.println("Counter: " + counter);
    }
    public static void main(String[] args) {
        String text = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are in drinking all day. We will move out of it in 5 days. ";
        numOfIndex(text, "in");

    }
}
