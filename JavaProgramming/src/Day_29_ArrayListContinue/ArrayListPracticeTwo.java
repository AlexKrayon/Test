package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeTwo {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Ahmet","David","Ahmet", "David", "Daniel","Shay", "Joe"));

        employees.retainAll(Arrays.asList("Ahmet","David"));
        System.out.println(employees);

        System.out.println("-----------------------------");

        String[]names = {"Ali","Ahmet","David","Ahmet", "David", "Daniel","Shay", "Joe"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.charAt(0) == 'A');
        list.removeIf(p-> p.charAt(0) == 'D');

          System.out.println(list);

          names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));





    }
}
