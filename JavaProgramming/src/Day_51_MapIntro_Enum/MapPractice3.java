package Day_51_MapIntro_Enum;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 183000);
        map.put("Alice", 183000);
        map.put("Gurhan", 140000);
        map.put("Kerry", 135500);
        map.put("Zafer", 98000);
        map.put("Alex", 154500);
        map.put("Okan", 132000);
        map.put("Ahmet", 183000);

        /**
        int maxSalary = Integer.MIN_VALUE;

        for (Integer eachValue : map.values()) {
            if(eachValue>maxSalary){
                maxSalary=eachValue;
            }
        }
         **/
        int maxSalary = Collections.max(map.values());
        System.out.println("Max Salary = " + maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxSalary){
                System.out.println(pair.getKey()+" : $"+maxSalary);
            }
        }
        
        
    }
}
