package Day_28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);
        }
        System.out.println(list);

        System.out.println("-------------------------");

        ArrayList<String> person = new ArrayList<>();

        person.add("Ali");
        person.add("Veli");
        person.add("Ahmet");
        person.add("John");
        person.add("Kerim");

        System.out.println(person);

        person.remove(0);

        System.out.println(person);

        person.remove("Veli");
        System.out.println(person);

        person.remove(2);
        System.out.println(person);








    }

}
