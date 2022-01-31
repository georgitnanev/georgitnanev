import java.util.Scanner;

public class Zadacha15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hex num: ");

        String hexNumber = scanner.nextLine();
        int decimal = 0;
        int size = hexNumber.length();
        int i =0;
        for (int j = size -1; j >=0 ; j--) {
            char c=hexNumber.charAt(j);
            if(c=='A') {
                decimal+=10*Math.pow(16,i);
            }
            else if(c=='B') {
                decimal+=11*Math.pow(16,i);
            }
            else if(c=='C') {
                decimal+=12*Math.pow(16,i);
            }
            else if(c=='D') {
                decimal+=13*Math.pow(16,i);
            }
            else if(c=='E') {
                decimal+=14*Math.pow(16,i);
            }
            else if(c=='F') {
                decimal+=15*Math.pow(16,i);
            }
            else {
                decimal+=Character.getNumericValue(c)*Math.pow(16,i);
            }
            i++;

        }


        System.out.println("Decimal number entered:" +decimal);
    }
}