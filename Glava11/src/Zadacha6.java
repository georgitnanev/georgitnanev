import java.util.Random;

public class Zadacha6 {
    public static void main(String[] args) {
        Random random = new Random();



        String[] action = new String[] {"I will.... in","I will put.....in the","I will smack.....in ",};
        String[] additionToTheAction = new String[] {"ears","mouth","nose"};
        String[] insult = new String[] {"cow","fool","idiot","cretin"};
        String[] epithet = new String[] {"crazy","wild","mad","deranged","nutty"};
        String[] noun = new String[] {"person","man","woman","animal","kid"};

        System.out.println("\n" +action[random.nextInt(3)]
                +" "+additionToTheAction[random.nextInt(3)]+ " "+insult [random.nextInt(4)]+"...and "
                +epithet[random.nextInt(5)]+ " "+noun [random.nextInt(5)]);
    }
}

