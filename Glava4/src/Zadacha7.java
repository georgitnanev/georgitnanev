import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a = ");
        int a = scanner.nextInt();
        System.out.printf("Enter b = ");
        int b = scanner.nextInt();
        System.out.printf("Enter c = ");
        int c = scanner.nextInt();
        System.out.printf("Enter d = ");
        int d = scanner.nextInt();
        System.out.printf("Enter e = ");
        int e = scanner.nextInt();

        System.out.println("The biggest number is: ");
        if (a >=b && a >=c && a >=d && a >=e) ;{
            System.out.println("a = " + a);
        }
        if (b >=a && b >=c && b >=d && b >=e) ;{

            System.out.println("b = " + b);
        } if(c >=a && c >=b && c >=d && c >=d);{

            System.out.println("c = " + c); }

         if(d >=a && d >=b && d >=c && d >=e);{

            System.out.println("d = " + d); }

         if(e >=a && e >=b && e >=c && e >=d);{        }

        System.out.println("e = " + e); }
}