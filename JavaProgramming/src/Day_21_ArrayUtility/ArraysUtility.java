package Day_21_ArrayUtility;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);

        System.out.println("-----------------------------------");

        int [] score = {65,48,90,85,70,95};
        System.out.println(Arrays.toString(score));
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Min Score: "+ score[0]);
        System.out.println("Max Score: "+ score[score.length-1]);

        String [] names = {"Ali", "Ahmet", "Zehra", "Mucahit","Sinema"};
        System.out.println(Arrays.toString(names)); // sorttan önce yazınca yukarıdaki gibi sonuç veriyor.
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        int [] ar1 = {1,2,3,4};
        int [] ar2 = {2,3,1,4};

        boolean r1 = Arrays.equals(ar1,ar2);
        System.out.println(r1);

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        boolean r2 = Arrays.equals(ar1,ar2);
        System.out.println(r2);

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        char [] ch1 = {'a','c', 'b'};
        char [] ch2 = {'b','a', 'c'};
        System.out.println(ch1);
        System.out.println(ch2);

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);
        

        









    }
}
