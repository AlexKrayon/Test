package Day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String[] g1 = {"alş","nbds","sfgsvg"};
        String[] g2 = {"jysjh","awrh","sggyum"};
        String[] g3 = {"wer","mjj","wdff"};

        String [][] groups = new String[3][];
        groups[0]= g1;
        groups[1]= g2;
        groups[2]= g3;


        System.out.println(Arrays.deepToString(groups));


        System.out.println("--------------------------------");

        int [][] arr2D = { {1,2,3,},{4,5,6,7,},{8,9,10} };

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println((arr2D[2][2]));


    }
}
