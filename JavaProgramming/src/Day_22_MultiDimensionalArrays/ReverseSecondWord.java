package Day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String [] word = sentence.split(" ");
        String reverse = "";

        for (int i = word[2].length()-1; i >= 0; i--) {
            reverse += word[2].charAt(i);
        }
        System.out.println(reverse);

        sentence = sentence.replaceFirst(word[2],reverse );

        word[2] = reverse;
        System.out.println(Arrays.toString(word));



    }
}
