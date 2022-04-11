package Day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethodsOne {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        students.add("Ali");
        students.add("Ali");
        students.add("Ali");

        nums.add(2,24);
        students.add("Veli");

        System.out.println(students);
        System.out.println(nums);

        System.out.println("-------------------------");
        System.out.println(nums.size());
        int lastIndex = nums.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        int n = nums.get(3);
        System.out.println("n = " + n);

        System.out.println("-------------------------");

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("-------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Mela");
        list.add("Soft");
        list.add("Soft");
        list.add("Trink");

        list.set(2,"MelaSoft");

        System.out.println(list);





    }
}
