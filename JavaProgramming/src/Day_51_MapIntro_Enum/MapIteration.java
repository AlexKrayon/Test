package Day_51_MapIntro_Enum;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {

        Map<String , Integer> students = new HashMap<>();

        students.put("Ali", 85);
        students.put("Veli", 83);
        students.put("Deli", 95);
        students.put("Muhtar", 75);
        students.put("Koray", 90);
        students.put("Adro", 87);

        /**
        Set<String>keys = students.keySet();

        for (String eachkey : keys) {
           // System.out.println(eachkey + " : "+students.get(eachkey));
            students.replace(eachkey,students.get(eachkey)+5);
        }
         **/

        System.out.println(students);

        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);
            if(eachValue<87){
                System.out.println(eachKey);
            }

        }



        Map<String, Integer> earlyBirds = new HashMap<>(); // score => 90
        Map<String, Integer> angryBird = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if(value>=90){
                earlyBirds.put(key,value);
            }else {
                angryBird.put(key,value);
            }

        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBird = " + angryBird);
        
        Set<String >names = students.keySet();
        System.out.println("names = " + names);

        //Collection<Integer> scores = students.values();
        List<Integer>scores = new ArrayList<>(students.values());
        System.out.println("scores = " + scores);
        
        for(Integer value : students.values()){
            System.out.println("value = " + value);
        }

        System.out.println("*************************");
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if(score > maxScore){
                maxScore=score;
            }
            if(score<minScore){
                minScore=score;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);


        System.out.println("*************************");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("*************************");

        // how many students has the score 87 or greater

        int count = 0;
    /**
        for (Integer eachScore : students.values()) {
            if(eachScore>=87){
                count++;
            }
        }
        System.out.println("count = " + count);
    **/

        for (String eachKey : students.keySet()) {
            Integer eachScore = students.get(eachKey);
            if(eachScore>=87){
                count++;
            }
        }

        System.out.println("count = " + count);


        System.out.println("*******************************");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
        


        


    }
}
