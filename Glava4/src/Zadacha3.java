import java.util.Scanner;

public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String company = "OrganicFood";
        String address = "StaraZagora";
        long phone = 611622;
        long fax = 622633;
        String website = "StzOrganicFood.com";
        String manager = "Zlatina Nonova, 0877670720";

        System.out.printf("The company name is %s. \n", company);
        System.out.printf("The address is in %s. \n", address);
        System.out.printf("The phone is %06d. \n", phone);
        System.out.printf("The fax is %06d. \n", fax);
        System.out.printf("The website is %s. \n", website);
        System.out.printf("The manager details are %s. \n", manager);

    }
}
