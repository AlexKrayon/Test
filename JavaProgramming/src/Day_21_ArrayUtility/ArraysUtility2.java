package Day_21_ArrayUtility;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String [] students = {"Elif", "Sinem", "Gunay", "David","Daniel","Ahmet","Neil"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);

      String[] others = Arrays.copyOf(students, 4);
        System.out.println(Arrays.toString(others));

        int [] num = {1,2,3,4,5,6,7,8,9,10,11,12};

        num = Arrays.copyOf(num,6);
        System.out.println(Arrays.toString(num));

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        char[] ch1 = {'A','B','C','D','E','F','G'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2,4);

        System.out.println(Arrays.toString(ch2));

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        int [] scores = {1,3,5,2,8,9,10,20,54,24,89};
        System.out.println(Arrays.toString(scores));

        int[]result = Arrays.copyOfRange(scores,3,8+1);

        System.out.println(Arrays.toString(result));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        int[]result1 = Arrays.copyOfRange(scores,3,8+1);
        System.out.println(Arrays.toString(result1));





        
        
        
        
        
    }
}
