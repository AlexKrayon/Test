package Day_20_Array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] num = {10,20,50,70};

        System.out.println(Arrays.toString(num));

        System.out.println("------------------------------------");

        int[] score = new int[5];

        score [0] = 35 ;
        score [1] = 85;
        score [score.length-1] = 95;
        score [2] = 75;
        score [3] = 20;


        System.out.println(Arrays.toString(score));

        System.out.println("------------------------------");

        String[] mon = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec","Ben",};
/*
        System.out.println(mon[0]);
        System.out.println(mon[1]);
        System.out.println(mon[2]);
        System.out.println(mon[3]);
        System.out.println(mon[4]);
        System.out.println(mon[5]);
        System.out.println(mon[6]);
        System.out.println(mon[7]);
        System.out.println(mon[8]);
        System.out.println(mon[9]);
        System.out.println(mon[10]);
        System.out.println(mon[11]);
        System.out.println(mon[12]);

*/

        for (int i = 0; i < mon.length ; i++) {
            System.out.println(mon[i]);
        }

        System.out.println("----------------------------------");

        for (int i = mon.length-1; i >=0 ; i--) {
            System.out.println(mon[i]);
        }



    }
}
