package Day_21_ArrayUtility;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String st1 = "asdfgh";
        String st2 = "hgfasd";

        char[] ch1 = st1.toCharArray();
        char[] ch2 = st2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);

    }
}
