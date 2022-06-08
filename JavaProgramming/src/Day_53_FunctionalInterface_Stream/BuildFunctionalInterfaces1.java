package Day_53_FunctionalInterface_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildFunctionalInterfaces1 {
    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);

        };
        boolean result = isPalindrome.test("Java");
        System.out.println(result);

        Predicate<Integer> isEven = p -> p%2==0;

        System.out.println("***************************");

        List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,9,1,2,3,4,5));
        list.removeIf(isEven);         //   list.removeIf(p -> p%2==0);
        System.out.println(list);

        System.out.println("***************************");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level","Ala", "Java","Yavuz","Anna"));
        names.removeIf(isPalindrome);
        System.out.println(names);


        System.out.println("***************************");

        // CONSUMER : does not return any object.

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Java");

        System.out.println("***************************");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.forEach(p->{if(p%2!=0) System.out.println(p);});

        System.out.println("***************************");

        Function<int[], List<Integer>> convertToList = (a)->{
            List<Integer>result1 = new ArrayList<>();
            for (int each : a) {
                result1.add(each);
            }
            return result1;
        };

        int[ ] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);


        System.out.println("***************************");

        Function<List<Integer>, int[]> convertToArray = (a) -> {

            int[] result2 = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result2[i]=a.get(i);

            }
            return result2;
        };
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int[] result3 = convertToArray.apply(numbers);
        System.out.println(Arrays.toString(result3));





    }
}
