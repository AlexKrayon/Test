package Day_13_String;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = scan.next();

        System.out.println("Last Name: ");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = f +"."+ l ;
        System.out.println("initial = " + initial);




    }
}
