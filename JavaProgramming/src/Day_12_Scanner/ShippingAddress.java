package Day_12_Scanner;

import java.util.Scanner;

public class ShippingAddress {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter building number");
        String buildingNumber = scan.next();
           scan.nextLine();
        System.out.println("Your Street address: ");
        String street = scan.nextLine();
        System.out.println("City name:");
        String city = scan.nextLine();
        System.out.println("State: ");
        String state = scan.next();
        scan.nextLine();
        System.out.println("Zip code ");
        String zipCode = scan.next();
        scan.nextLine();
        System.out.println("Country name: ");
        String country = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

        scan.close();



    }
}
