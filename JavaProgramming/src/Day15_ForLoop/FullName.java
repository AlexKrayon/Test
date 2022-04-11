package Day15_ForLoop;

import java.util.Locale;

public class FullName {
    public static void main(String[] args) {

        String firstName = "AhMEt",
                lastName = "yamaTaKi";

       // firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        firstName = (""+ firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

    }
}
