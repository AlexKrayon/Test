package Day_53_FunctionalInterface_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,3,4,4,4,5,5,6,6,7,7));
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println("list = " + list);;


        int [] arr1 = {1,1,2,2,2,3,3,4,4,4,5,5,6,6,7};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        System.out.println("***************************");

        List<Integer>list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        list2 = list2.stream().skip(4).collect(Collectors.toList());
        System.out.println(list2);

        int[] num2 = {1,2,3,4,5,6,7,8};
        num2 = Arrays.stream(num2).skip(3).toArray();
        System.out.println(Arrays.toString(num2));


        List<Integer>list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        list3 = list3.stream().limit(5).skip(2).collect(Collectors.toList());
        System.out.println(list3);


        List<Integer>list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        list4 = list4.stream().map(p->p*10).collect(Collectors.toList());
        System.out.println(list4);


        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        System.out.println(days);
        days = days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());
        System.out.println(days);

        List<Integer>list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer>evens= list5.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(evens);


                List<String> names = new ArrayList<>(Arrays.asList("Monday","Monday","Wednesday","Monday","Friday","Monday","Sunday"));
        long countMon = names.stream().filter(p->p.equalsIgnoreCase("monday")).count();
        System.out.println(countMon);

        names.stream().filter(p->p.equalsIgnoreCase("monday")).forEach(p-> System.out.println(p));

        List<Integer>list6 = new ArrayList<>(Arrays.asList(1,2,3,3,3,4,4,4,4,5,6,7,8,9,12,13,14));
        boolean r1 = list6.stream().allMatch(p->p%2==0);
        System.out.println(r1);

        boolean r2 = list6. stream().anyMatch(p->p<10);
        System.out.println(r2);

        boolean r3 = list6.stream().noneMatch(p->p%3==0);
        System.out.println(r3);

        boolean r4 = list6.stream().noneMatch(p->p>20);
        System.out.println(r4);












    }

}
