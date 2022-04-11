package Day_20_Array;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[]letters = new char[26];

        //for (char i = 'A' , j=0; i <='Z' && j < letters.length ; i++,j++) {
           // letters[j]= i;
            // Şu şekilde de olabilir.
          /*  for(int i = 0, j='A'; i<letters.length; i++,j++){ letters[i] = (char)j;

        }
        Başka bir yol daha
           */
        char ch = 'A';
        for (int i = 0; i < letters.length ; i++, ch++) {
            letters[i] = ch;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("-----------------------------------------");

        char[]letters2 = new char[26];
        for (int i = 0, j= 'Z'; i > letters.length; i++,j++) {
            letters2[i] = (char)j;
        }

        System.out.println(Arrays.toString(letters2));



    }
}
