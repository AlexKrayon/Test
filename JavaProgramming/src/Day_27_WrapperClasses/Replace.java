package Day_27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        arr = replace(arr, 2,30);
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------");

        String[]ar = {"Java","Python","Ruby"};
        ar= replace(ar,2,"C#");
        System.out.println(Arrays.toString(ar));

    }

    // replace the elements of the array at given index with the new element
    public static int[] replace(int[]array, int index, int newElement){
        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static double[] replace(double[]array, int index, double newElement){
        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static char[] replace(char[]array, int index, char newElement){
        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static String[] replace(String[]array, int index, String newElement){
        if(index < 0 || index > array.length - 1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }






}
