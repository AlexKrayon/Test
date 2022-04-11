package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("--------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("--------------------------");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.swap(list3,2,5); // Index numaralardaki rakamların yerleri değişir
        System.out.println(list3);

        System.out.println("--------------------------");

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("--------------------------");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,90,80,10,10,10,40,30,20,10));

        Collections.replaceAll(list4, 10,150);
        System.out.println(list4);

        System.out.println("--------------------------");

        int freq = Collections.frequency(list4, 150);
        System.out.println("freq = " + freq);

        System.out.println("--------------------------");

        ArrayList<String> word = new ArrayList<>();
        word.addAll(Arrays.asList("Java", "Python","JavaScript","CH","Java","Ali","java","jale"));

        int count = Collections.frequency(word, "Java");

        System.out.println("count = " + count);










    }
}
