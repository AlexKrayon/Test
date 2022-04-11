package Day_21_ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";

        for (char each: str.toCharArray()) {
            System.out.println(each);
        }

        System.out.println("_____________________________-");

        String sen = "Fatih Balcı";

        String [] words = sen.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("_____________________________-");

        String email = "woodenspoon@cydeo.com";
        String [] arr = email.split("@");
        System.out.println(Arrays.toString(arr));




    }
}
