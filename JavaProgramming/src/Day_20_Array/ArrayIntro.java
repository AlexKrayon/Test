package Day_20_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // create a variable contains five names

        String[] myGroup = new String[5];
        myGroup[0] = "Ahmet";
        myGroup[1] = "Akın";
        myGroup[2] = "Veli";
        myGroup[3] = "Cafer";
        myGroup[4] = "Muhtar";

        System.out.println(Arrays.toString(myGroup)); // "Ahmet", "Akın", "Veli", "Cafer", "Muhtar"

        System.out.println("----------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println(Arrays.toString(days));

        int number = 8;

        if (number < 1 || number > 7) {
            System.err.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(days[number - 1]);


    }

}
