package Day_51_MapIntro_Enum;

import java.util.*;

public class MapPractice4 {
    public static void main(String[] args) {

/**
        String [] group1 = {"Ali","Duygu","Hasan", "Serkan", "Ati", "Yavuz","Sefer", "Murat"};
        String [] group2 = {"Betty","Kelly","Jury", "Paker", "John", "Olcay","Ahmet", "Nadir"};
        String [] group8 = {"Muhtar","Frank","Alex", "Krayon", "Ferdi", "Arda","Ubeyd", "Musa"};
        String [] group24 = {"Asya","Yasin","Emrah", "Serkan", "Barıs", "Lima","Sefer", "Deli"};
        String [] group9 = {"Nazar","Asena","Cırak", "Inanan", "Yavuz", "Parlak","Gelen", "Onur","Vali"};
**/

        ArrayList<String>group1 = new ArrayList<>(Arrays.asList("Ali","Duygu","Hasan", "Serkan", "Ati", "Yavuz","Sefer", "Murat"));
        ArrayList<String>group2 = new ArrayList<>(Arrays.asList("Betty","Kelly","Jury", "Paker", "John", "Olcay","Ahmet", "Nadir"));
        ArrayList<String>group8 = new ArrayList<>(Arrays.asList("Muhtar","Frank","Alex", "Krayon", "Ferdi", "Arda","Ubeyd", "Musa"));
        ArrayList<String>group24 = new ArrayList<>(Arrays.asList("Asya","Yasin","Emrah", "Serkan", "Barıs", "Lima","Sefer", "Deli"));
        ArrayList<String>group9 = new ArrayList<>(Arrays.asList("Nazar","Asena","Cırak", "Inanan", "Yavuz", "Parlak","Gelen", "Onur","Vali"));


        Map<Integer, ArrayList<String>> groups = new TreeMap<>();
        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(8,group8);
        groups.put(24,group24);
        groups.put(9,group9);

        System.out.println(groups);

        for (String each : groups.get(8)) {
            System.out.println(each);
        }

        System.out.println("************************");
        for (ArrayList<String> eachGroup : groups.values()) {
            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }

        }



    }
}
