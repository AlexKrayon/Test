package Day_25_CustomMethodsRecaps;

import Utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};

        ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------------");

        double[]arr2 = {1.4,2.6,3.7,5.9};
        ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------------");

        char []arr3 = {'A','B','C'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("---------------------------");

        String [] arr4 ={"Ali","Veli","Deli"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("---------------------------");

        int[]n1 = {1,2,3,4,7,9,5};
        int max = ArraysUtility.max(n1);
        System.out.println("max = " + max);

        System.out.println("---------------------------");

        double []n2= {2.3,1.5,6.4,7.9};
        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("---------------------------");

        int []a1 = {1,2,3,4,5,6};
        boolean r1 = ArraysUtility.contains(a1,8);
        System.out.println("r1 = " + r1);


    }



}
