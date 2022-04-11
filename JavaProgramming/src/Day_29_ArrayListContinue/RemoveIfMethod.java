package Day_29_ArrayListContinue;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf( p -> p > 5); // lambda expression
        System.out.println(list);

        System.out.println("------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list2.removeIf( each -> each %2 == 0);
        System.out.println(list2);

        System.out.println("------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python","JavaScript","CH","Java","Ali","java","jale"));
        list3.removeIf(p-> p.toLowerCase().startsWith("j"));
        System.out.println(list3);

        System.out.println("------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Anna","Eye","CH","Java","Ala","emme","adanada"));

        names.removeIf(name -> !StringUtility.isPalindrome(name));
        System.out.println(names);






    }
}
