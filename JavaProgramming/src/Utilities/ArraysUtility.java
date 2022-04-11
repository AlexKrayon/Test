package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    
    // print each integer of an integer array in separate lines
    public static void printEachElement(int[]array){

        for (int each : array) {
            System.out.println(each);
        }
    }
    
    
    // print each double of a double array in separate lines
    public static void printEachElement(double[]array){

        for (double each : array) {
            System.out.println(each);
        }
    }
    
    
    // print each char of a char array in separate lines
    public static void printEachElement(char[]array){

        for (char each : array) {
            System.out.println(each);
        }
    }
    
    
    // print each String of a string array in separate lines
    public static void printEachElement(String[]array){

        for (String each : array) {
            System.out.println(each);
        }
    }
    
    //returns the max number from integer array
    public static int max(int[]numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the Min number from integer array
    public static int Min(int[]numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the max number for double array
    public static double max(double[]numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the Min number from double array
    public static double Min(double[]numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    
    //checks if an integer is contained / contains methods
    public static boolean contains(int[]array, int element){
        boolean result = false;
        for (int each : array) {
            if(each == element){
                result = true;
            }
        }
              return result;  
    }

    //checks if a double is contained / contains methods
    public static boolean contains(double[]array, double element){
        boolean result = false;
        for (double each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if a char is contained / contains methods
    public static boolean contains(char[]array, char element){
        boolean result = false;
        for (char each : array) {
            if(each == element){
                result = true;
            }
        }
        return result;
    }

    //checks if a String is contained / contains methods
    public static boolean contains(String[]array, String element){
        boolean result = false;
        for (String each : array) {
            if( each.equals(element)){
                result = true;
            }
        }
        return result;
    }

    // adds the given element to array, returns a new array
    public static int[] addElement (int []array, int element){
        int[] result = new int [array.length +1];
        int i = 0;
        for (int each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }

    // adds the given element to array, returns a new array
    public static double [] addElement (double[] array, double element){
        double [] result = new double [array.length +1];
        int i = 0;
        for (double each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }

    // adds the given element to array, returns a new array
    public static char [] addElement (char [] array, char element){
        char [] result = new char [array.length +1];
        int i = 0;
        for (char each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }

    // adds the given element to array, returns a new array
    public static String [] addElement (String [] array, String element){
        String [] result = new String [array.length +1];
        int i = 0;
        for (String each : array) {
            result [i++]=each;
        }
        result [i] = element;
        return result;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[]array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[]array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[]array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[]array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
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

    //merge the given two arrays and returns the new array
    public static int[] merge(int[]arr1, int[]arr2){
       int[]result = {}; // int[]result = new int [arr1.length+arr2.length];
        for (int each : arr1) {
            result = addElement(result, each);
        }
        for (int each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }

    public static double[] merge(double[]arr1, double[]arr2){
        double[]result = {}; // int[]result = new int [arr1.length+arr2.length];
        for (double each : arr1) {
            result = addElement(result, each);
        }
        for (double each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }

    public static char[] merge(char[]arr1, char[]arr2){
        char[]result = {}; // int[]result = new int [arr1.length+arr2.length];
        for (char each : arr1) {
            result = addElement(result, each);
        }
        for (char each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }

    public static String[] merge(String[]arr1, String[]arr2){
        String[]result = {}; // int[]result = new int [arr1.length+arr2.length];
        for (String each : arr1) {
            result = addElement(result, each);
        }
        for (String each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }


    //reverse the given array, returns a new array
    public static int[] reverse(int[]array){
        int[] result= new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result [j++] =array[i];
        }
        return result;
    }

    public static double[] reverse(double[]array){
        double[] result= new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result [j++] =array[i];
        }
        return result;
    }

    public static char[] reverse(char[]array){
        char[] result= new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result [j++] =array[i];
        }
        return result;
    }

    public static String[] reverse(String[]array){
        String[] result= new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result [j++] =array[i];
        }
        return result;
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


    // replaces all the matching old values with the new values
    public static int[] replaceAll(int[]array, int oldValue,int newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[]array, double oldValue,double newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[]array, char oldValue,char newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[]array, String oldValue,String newValue){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){
                array[i]=newValue;
            }
        }
        return array;
    }


    // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[]array){
        int [] result= {};

        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static double[] removeDuplicates(double[]array){
        double [] result= {};

        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static char[] removeDuplicates(char[]array){
        char [] result= {};

        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static String[] removeDuplicates(String[]array){
        String [] result= {};

        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }


    // StrongPassword
    public static boolean isStrongPassword(String password){

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // contains at least one special character
        boolean r5 = false; // contains at least one digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;


    }




















}
