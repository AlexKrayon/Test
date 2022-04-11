package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,2,4,5,3,6,8,8,9,9,6,3,2));

        int n = 3;
        for (int i = 1; i < n; i++) {
            list.removeIf(p-> Collections.max(list) == p);
        }
        //list.removeIf(p-> Collections.max(list) == p);
        //list.removeIf(p-> Collections.max(list) == p);

        int max = Collections.max(list);
        System.out.println(max);



    }
}
