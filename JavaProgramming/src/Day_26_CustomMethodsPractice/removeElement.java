package Day_26_CustomMethodsPractice;

import java.util.Arrays;

public class removeElement {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
       num= removeElement(num,3);
        num= removeElement(num,3);
        System.out.println(Arrays.toString(num));

    }
    // removes the index from the array, returns new array
    public static int[]removeElement (int[] array, int index){

        if(index < 0 || index > array.length -1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        int [] result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i< array.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array [i];
        }
        return result;
    }


    public static double[]removeElement (double[] array, int index){

        if(index < 0 || index > array.length -1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        double [] result = new double[array.length-1];

        int j = 0;
        for (int i = 0; i< array.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array [i];
        }
        return result;
    }


    public static char[]removeElement (char[] array, int index){

        if(index < 0 || index > array.length -1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        char [] result = new char[array.length-1];

        int j = 0;
        for (int i = 0; i< array.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array [i];
        }
        return result;
    }


    public static String[]removeElement (String[] array, int index){

        if(index < 0 || index > array.length -1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        String [] result = new String[array.length-1];

        int j = 0;
        for (int i = 0; i< array.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = array [i];
        }
        return result;
    }



}
