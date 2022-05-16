package Day_50_CollectionAndIterable;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6));

        System.out.println(set);

       // Integer[] array = set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>(set);

        System.out.println(list);

        List<String> names = null;

        // System.out.println(names.size());



    }
}
