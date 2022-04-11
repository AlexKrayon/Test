package Day_22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimArray {
    public static void main(String[] args) {
        int [][] arr2D = { {1,2,3,},{4,5,6,7,},{8,9,10} };

        for (int i = 0; i < arr2D.length; i++) {
            //System.out.print(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");

            }


        }



    }
}
