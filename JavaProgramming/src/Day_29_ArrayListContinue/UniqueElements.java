package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,90,80,10,10,10,40,40,20,10));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list,each);
            if(frequency == 1){
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("----------------------------------"); // second solution

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,90,80,10,10,10,40,40,20,10));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);

        unique2.removeIf(p-> Collections.frequency(list2, p) >1);
        System.out.println("unique2 = " + unique2);




    }
}
