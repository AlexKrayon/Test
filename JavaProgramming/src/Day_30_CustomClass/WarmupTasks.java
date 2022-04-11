package Day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {
        // write a program that can swap the first and last elements of an ArrayList
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(nums, 0, nums.size()-1);
        System.out.println(nums);

        System.out.println("------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,4,0,5,0,6)); // remove all 0 's to the end.
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize = list.size();
        System.out.println(newSize);

        int totalNumberOfZeros = size - newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list);

        System.out.println("----------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,4,0,5,0,6));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }


        System.out.println(result);

        System.out.println("-----------------------------");

        String str = "ABCD45678JFH%&^^!?GH";
        System.out.println(str);

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>( chars ); // add all characters
        letters.removeIf(p-> !Character.isLetter(p)); // remove the characters that are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>( chars ); // add all characters
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);


        ArrayList<Character> specials = new ArrayList<>( chars ); // add all characters
        // specials.removeAll(letters);
        // specials.removeAll(digits);
        specials.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("specials = " + specials);








    }

}
