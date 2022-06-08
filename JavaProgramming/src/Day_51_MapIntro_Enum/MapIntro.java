package Day_51_MapIntro_Enum;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {
        Map<Integer, String> hashMap= new HashMap<>();
        hashMap.put(10,"Ali");
        hashMap.put(20,"Ahmet");
        hashMap.put(13,"Veli");
        hashMap.put(33,"Latif");
        hashMap.put(8,"Arif");
        hashMap.put(9,"Serkan");

        System.out.println("hashMap = " + hashMap);


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();


        linkedHashMap.put(10,"Ali");
        linkedHashMap.put(20,"Ahmet");
        linkedHashMap.put(13,"Veli");
        linkedHashMap.put(33,"Latif");
        linkedHashMap.put(8,"Arif");
        linkedHashMap.put(9,"Serkan");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        //key can not be null, value can be null and dublicated
        treeMap.put(10,"Ali");
        treeMap.put(20,"Ahmet");
        treeMap.put(13,"Veli");
        treeMap.put(33,"Latif");
        treeMap.put(8,"Arif");
        treeMap.put(9,"Serkan");

        System.out.println("treeMap = " + treeMap);

        Map<Integer, String> hashtable = new Hashtable<>();
        //key and value can not be null

        hashtable.put(10,"Ali");
        hashtable.put(20,"Ahmet");
        hashtable.put(13,"Veli");
        hashtable.put(33,"Latif");
        hashtable.put(8,"Arif");
        hashtable.put(9,"Serkan");

        System.out.println("hashtable = " + hashtable);


    }
}
