package Day_26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int [] array = {1,1,2,3,3,3,4,4,5,6,6,6,7};
        int[]unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

    }

    // returns the unique elements of the array as a new array
    public static int [] uniqueElements(int[]array){
        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
               result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double [] uniqueElements(double[]array){
        double[] result = {};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char [] uniqueElements(char[]array){
        char[] result = {};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String [] uniqueElements(String[]array){
        String[] result = {};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }




}
