package Day_49_CollectionCont;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {
        String [] arr = {"Book","Pen","Pencil", "Door", "Pen","Cydeo", "Cydeo", "Book", "Milk","Book"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray( new String [0]); // asagıdaki bölüm yerine bu da yazılabilir.

        /**Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]);
        System.out.println(set1);
        **/

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,100,100,30,300,30,20,22,22,22,27,30));

        list = new ArrayList<>( new LinkedHashSet<>(list));
        System.out.println(list);

        System.out.println("***********************************");

        String[] array = {"A","A","B","C"};

        Set<String> s = new LinkedHashSet<>();

        s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("E","E","F","G"));

        System.out.println(s);

        System.out.println("***********************************");
        Integer[] nums = {1,2,3,1,2,3,1,2,3,4,4,4,5,5,6,7,8,8,8,8,8,7,6,5,9,99,9,3};
        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));



        System.out.println("***********************************");

        String str = "aaabbbbcccddeeeffff";
        String result = "";
        for (String each : new LinkedHashSet<>( Arrays.asList(str.split("")))){
            int count = Collections.frequency( Arrays.asList(str.split("")), each);
            result += each+count;
        }

        System.out.println(result);



        // System.out.println(result);




    }
}
