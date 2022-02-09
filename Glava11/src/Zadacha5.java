import java.util.Random;

public class Zadacha5 {
    public static void main(String[] args) {
        Random random = new Random();


        String[] praisingPhrases = new String[] {"Excellent product. ","It's a great product. ","I use it all the time. ",
                "This is the best product of this category. "};
        String[] praisingStories = new String[] {"I already feel good. ","I managed to change. ","It did wonders. ",
                "I can't believe, but I feel great now.","Try it, I am very satisfied. "};
        String[] firstNames = new String[] {"Diana ","Petya ","Stela ","Elena ","Katya "};
        String[] lastNames = new String[] {"Ivanova - ","Petrova - ","Kirova - "};
        String[] cities = new String[] {"Sofia ","Plovdiv ","Varna ","Ruse ","Burgas "};

        System.out.println("\n"+ praisingPhrases[random.nextInt(4)]+praisingStories[random.nextInt(5)]
        +firstNames[random.nextInt(5)]+lastNames[random.nextInt(3)]+cities[random.nextInt(5)]);
    }
}
