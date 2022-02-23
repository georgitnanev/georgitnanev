import java.util.regex.Pattern;

public class Zadacha6 {
    public static String reverseText(String text) {


        Pattern pat = Pattern.compile("\\s");
        String[] tmp = pat.split(text);
        String result = "";
        for (int i = 0; i < tmp.length; i++) {
            if (i == tmp.length - 1)
                result = tmp[i] + result;
            else
                result = " " + tmp[i] + result;

        }
        return result;
    }


    public static void main(String[] args) {
        String text = "C# is not C++ and PHP is not Delphi";
        System.out.println(reverseText(text));
    }
}




