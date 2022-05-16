package Day_50_CollectionAndIterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice2 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","Ali", "John","Serkan","Fatih","ahmed","Ahmed"));
        //remove all the names 'Ahmed'

        //names.removeAll(Arrays.asList("Ahmed"));

        Iterator<String> it = names.iterator(); // using while loop
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("*******************************");
        //using for loop
        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed","ahmed","Ali", "John","Serkan","Fatih","ahmed","Ahmed"));

        for (Iterator<String>i=names2.iterator(); i.hasNext(); ) {
            if(i.next().equalsIgnoreCase("ahmed")){
                i.remove();
            }

        }

        System.out.println(names2);

        System.out.println("*******************************");
        //using for loop
        List<String> names3 = new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed","ahmed","Ali", "John","Serkan","Fatih","ahmed","Ahmed"));

        names3.removeIf(each -> each.equalsIgnoreCase("Ahmed"));
        System.out.println(names3);






    }
}
