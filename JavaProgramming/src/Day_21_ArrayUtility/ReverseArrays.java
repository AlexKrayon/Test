package Day_21_ArrayUtility;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int [] num = {10,20,30,40,50,60};

        System.out.println(Arrays.toString(num));

        int [] reserved = new int[num.length];


        for (int i = num.length - 1,j=0; i >= 0; i--,j++) {
            reserved[j]=num[i];

        }


        System.out.println(Arrays.toString(reserved));




    }
}
