package Day_13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Age: ");
        int age= scan.nextInt();
        System.out.println("Gender: ");
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Name: ");
        String name= scan.nextLine();
        System.out.println("Phone number: ");
        long phone = scan.nextLong();
        System.out.println("Zip code: ");
        int zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("School name: ");
        String schoolName = scan.nextLine();
        System.out.println("City name: ");
        String city = scan.nextLine();
        System.out.println("State name: ");
        String state = scan.next();
        System.out.println("Building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Street name: ");
        String street = scan.nextLine();

        scan.close();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("zipCode = " + zipCode);
        System.out.println("street = " + street);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("schoolName = " + schoolName);




    }
}
