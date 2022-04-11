package Day_20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alph = new char[26];
        alph[0]= 'Z';
        // System.out.println(alph);

        char ch = 'Z';
        for (int i = 0; i < alph.length; i++, ch --) {
            alph[i] = ch;
        }
        System.out.println(Arrays.toString(alph));

            for(char i =0, j='Z'; i< alph.length; i++,j--){
                alph [i] =j;
            }




        System.out.println(Arrays.toString(alph));
        System.out.println(alph[0]);



    }
}
