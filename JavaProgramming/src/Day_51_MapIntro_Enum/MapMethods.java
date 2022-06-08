package Day_51_MapIntro_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Ali", 85);
        students.put("Veli", 83);
        students.put("Deli", 95);
        students.put("Muhtar", 75);
        students.put("Koray", 60);
        students.put("Adro", 87);

        System.out.println(students);
        System.out.println(students.size());

        System.out.println(students.get("Deli"));
        System.out.println("students.get(\"Adro\") = " + students.get("Adro"));

        students.replace("Koray",90);
        System.out.println(students);

        boolean r1= students.containsKey("Fatih"); // returns boolean
        System.out.println(r1);

        boolean r2 = students.containsValue(100);
        System.out.println(r2);


    }
}
