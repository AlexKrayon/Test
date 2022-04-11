package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeOne {
    public static void main(String[] args) {
        String [] countries = {"Japan","Korea","US","Turkey","UK","Canada"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf( p -> p.length()>5);

        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));


    }
}
