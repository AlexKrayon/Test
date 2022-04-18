package Utilities;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args)throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of minutes:");
        int minutes=scan.nextInt();
        scan.close();

        for (int i = minutes; i >0 ; i--) {
            for (int j = 59; j >=0 ; j--) {
                System.out.print("\r" +(i-1)+" minutes and "+j+" seconds left.");
                Thread.sleep(1000);
            }
        }
        //System.out.println("\n\n");




    }
}
