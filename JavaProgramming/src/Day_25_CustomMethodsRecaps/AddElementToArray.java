package Day_25_CustomMethodsRecaps;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------");

        double[] arr2 = {1.5,2.4,5.7,4.5};
        arr2 = addDouble(arr2,3.5);
        arr2 = addDouble(arr2,6.0);
        System.out.println(Arrays.toString(arr2));

        System.out.println("---------------------------");
        char[] arr3 = {'A','B','C'};
        arr3 = addChar(arr3,'F');
        arr3 = addChar(arr3,'G');
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------");
        String[] arr4 = {"Ali","Ahmet","Veli"};
        arr4 = addString(arr4,"Deli");
        arr4 = addString(arr4,"Hayri");
        arr4 = addString(arr4,"Kuyruk Dik");
        System.out.println(Arrays.toString(arr4));


    }

    public static int[] addInteger (int []array, int element){
        int[] result = new int [array.length +1];
        int i = 0;
        for (int each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }

    public static double [] addDouble (double[] array, double element){
        double [] result = new double [array.length +1];
        int i = 0;
        for (double each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }

    public static char [] addChar (char [] array, char element){
        char [] result = new char [array.length +1];
        int i = 0;
        for (char each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }

    public static String [] addString (String [] array, String element){
        String [] result = new String [array.length +1];
        int i = 0;
        for (String each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }


}
