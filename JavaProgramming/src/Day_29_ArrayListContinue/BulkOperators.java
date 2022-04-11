package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperators {

    public static void main(String[] args) {
        ArrayList<String> titles = new ArrayList<>();

        titles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET", "Master", "BA","BA"));

        titles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(titles);

        System.out.println("---------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,1,2,3,7,7,8,9,10));
        boolean r1  = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(7) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2,5,7,11));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------------");

        String [] names = {"John","Jack", "Ali","Veli"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println(nameList);

        System.out.println("---------------------------");

        Integer [] arr= {1,2,3,4,5,6,7,8};  // int primitive oldugu için error verir. Integer olması lazım
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        System.out.println("---------------------------");
        int[]arr2 = {1,2,3,4,5,6,7};
        ArrayList<Integer> List3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("List3 = " + List3);


    }

    public static ArrayList<Integer> convertArrayToArrayList (int[]array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;

    }




}
