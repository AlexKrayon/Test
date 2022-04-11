package Day_21_ArrayUtility;

import java.util.Arrays;

public class MergingArrays {
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4,5,6,7};
        int [] ar2 = {5,6,7,8,9,10,11};

        int [] arr = new int [ar1.length + ar2.length];
        int i = 0;

        for (int each : ar1) {
            arr[i++] = each;
        }
        for (int each : ar2) {
            arr[i++] = each;
        }

        int j = 0;
        String [] grup1 = {"Ali", "Veli", "Deli"};
        String [] grup2 = {"Mary", "Paul", "Valery"};

        String [] all = new String[grup1.length+ grup2.length];

        for (String each1 : grup1) {
            all[j++]=each1;
        }
        for (String each1 : grup2) {
            all[j++]=each1;
        }


        char [] ch1 = {'A','B','C'};
        char [] ch2 = {'B','C','D','E'};

        char [] chars = new char[ch1.length+ ch2.length];

        int k = 0;
        for (char ch : ch1) {
            chars [k] = ch;
            k++;
        }
        for (char ch : ch2) {
            chars [k] = ch;
            k++;
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(all));
        System.out.println(Arrays.toString(chars));



    }
}
