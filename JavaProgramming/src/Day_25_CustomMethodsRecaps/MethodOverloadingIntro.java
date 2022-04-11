package Day_25_CustomMethodsRecaps;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int [] intArray = {5,6,3,-3,7};
        Arrays.sort(intArray);

        double [] doubleArray = {5.5,6.3,3.7,-3.2,7.0};
        Arrays.sort(doubleArray);

        char [] charArray = {'A','B','C'};
        Arrays.sort(charArray);


        System.out.println("-------------------");

        double sum1 = sumOfNumbers(10,20,30);

        int sum2 = sumOfNumbers(23,45);

        int sum3 = sumOfNumbers(12,23,45,78);

        // System.out.println(sumOfNumbers(10,20,30));

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

            }


    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }
    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 +num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 +num3+num4;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4, int num5) {
        return num1 + num2 +num3+num4+num5; // return sumOfNumbers(num1 + num2 +num3+num4)+num5;
    }



}
