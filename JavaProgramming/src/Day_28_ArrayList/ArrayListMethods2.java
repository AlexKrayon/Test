package Day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.println(list);
        /*
        int num = 1;
        list.remove(num);
        System.out.println(num);

         */

        Integer num1 = 200;
        list.remove(num1);
        System.out.println(list);

        System.out.println("-----------------------");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);



    }
}
