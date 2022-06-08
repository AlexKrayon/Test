package Day_51_MapIntro_Enum;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer>map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Alice", 100000);
        map.put("Gurhan", 140000);
        map.put("Kerry", 135500);
        map.put("Zafer", 98000);
        map.put("Alex", 154500);
        map.put("Okan", 132000);
        map.put("Ahmet", 183000);

        //who has the max&min salary?
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";

        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if(eachValue>maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;
            }
            if(eachValue<minSalary){
                minSalary=eachValue;
                name2=eachKey;
            }

        }

        System.out.println(name1);
        System.out.println(name1+" : $"+maxSalary);
        System.out.println("**************************");
        System.out.println(name2);
        System.out.println(name2+" : $"+minSalary);


        System.out.println("**************************");

        //how many employee has the salary between 100000 and 140K?

        int count = 0;

        for (Integer eachValue : map.values()) {
            if(eachValue>=100000 && eachValue<=140000){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("**************************");

        // display the names of the employees who are making less than 123K.

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue()<=123000){
                System.out.println(pair.getKey()+" : $"+ pair.getValue());
            }
        }


        System.out.println("**************************");

        // increase the salary by 10k if the current salary is less than 130k
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() <= 130000){
                entry.setValue(entry.getValue()+10000);
            }
        }

        System.out.println(map);



    }
}
