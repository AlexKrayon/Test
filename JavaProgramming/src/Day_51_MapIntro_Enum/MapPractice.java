package Day_51_MapIntro_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

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

        /**
         for (String key : employeeMap.keySet()) {
         if(employeeMap.get(key).equalsIgnoreCase("m")){
         employeeMap.replace(key, "Male");
         }

         if(employeeMap.get(key).equalsIgnoreCase("f")){
         employeeMap.replace(key, "Female");
         }
         }
         **/

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("m")) {
                entry.setValue("Male");
                //employeeMap.replace(entry.getKey(), "Male");
            }

            if (entry.getValue().equalsIgnoreCase("f")) {
                entry.setValue("Female");

                // System.out.println(entry);
            }
            System.out.println(employeeMap);

            System.out.println("*********************************");

            for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
                String eachKey = eachPair.getKey();
                String eachValue = eachPair.getValue();

                if(eachValue.equals("Female")){
                    System.out.println(eachKey);
                }
            }


        }
    }

}
