import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadacha3 {

        public static void main(String[] args) {
            String word = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";
            int i = 0;
            Pattern p = Pattern.compile("(<upcase>).+?(</upcase>)");
            Matcher m = p.matcher(word);

            int index = word.indexOf("<upcase>");
            while (index != -1) {
                i++;
                index = word.indexOf("<upcase>", index +1);

            }
            String[] wordArr = new String[i];
            String[] tagsWord = new String[i+1];
            tagsWord[i] = "";

            for (int j = 0;  m.find(); j++) {
                wordArr[j] = m.group();
                tagsWord[j] = wordArr[j].substring(8, (wordArr[j].length() - 9));
            }
            for (int j = 0; j < wordArr.length; j++) {

            }
            String[] sentenceArr = word.split("(<upcase>).+?(</upcase>)");
            for(int j = 0; j < sentenceArr.length; j++) {
                System.out.print(sentenceArr[j] + tagsWord[j].toUpperCase());
            }

        }

    }