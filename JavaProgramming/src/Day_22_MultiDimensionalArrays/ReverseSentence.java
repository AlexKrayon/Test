package Day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";
        String [] word = sentence.split(" ");
        System.out.println(Arrays.toString(word));

        String reverse = "";
        for (int i = word.length-1; i >=0; i--) {
            reverse += word[i]+" ";
        }
        System.out.println(reverse);


    }
}
