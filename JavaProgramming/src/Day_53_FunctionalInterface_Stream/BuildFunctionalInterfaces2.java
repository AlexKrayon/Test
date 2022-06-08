package Day_53_FunctionalInterface_Stream;

import Week_04_ReviewSection.score;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildFunctionalInterfaces2 {
    public static void main(String[] args) {

        BiPredicate<Integer[], Integer> contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b) {
                    result = true;
                    break;
                }
            }
            return result;
        };
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 12, 13, 14};
        boolean r1 = contains.test(arr, 13);

        System.out.println(r1);

        System.out.println("*********************************************");

        BiPredicate<String, String> anagram = (a, b) -> {
            String[] arr1 = a.split("");
            String[] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println("*********************************************");

        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Java", 5);

        System.out.println("*********************************************");

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Daniel", "M");
        employeeMap.put("Ayse", "F");
        employeeMap.put("Fatma", "F");
        employeeMap.put("Ali", "M");
        employeeMap.put("Veli", "M");
        employeeMap.put("Deli", "M");
        employeeMap.put("Yeli", "F");
        employeeMap.put("Hayfgd", "F");
        employeeMap.put("Oguz", "M");

        employeeMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("*********************************************");

        //create a function that takes two integers and returns the max

        BiFunction<Integer, Integer, Integer> maxNumber = (a, b) -> (a > b) ? a : b;

        int max = maxNumber.apply(100, 140);
        System.out.println(max);


        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : x) result.add(each);
            for (int each : y) result.add(each);
            return result;
        };

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        List<Integer> nums = merge.apply(arr1, arr2);
        System.out.println(nums);


        System.out.println("*********************************************");
        // create a function that takes a list of String and a list of

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2 = (j,k)->{
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i), k.get(i));
            }
            return map;
        };
        List<String>names2 = new ArrayList<>(Arrays.asList("John","Daniel","Ali"));
        List<Integer> scores2 = new ArrayList<>(Arrays.asList(90,25,74));
        Map<String, Integer> students = merge2.apply(names2,scores2);
        System.out.println(students);
        //names {"John","Daniel"};
        //score {100,110};

        //map {John = 100, Daniel = 110};





    };


}

