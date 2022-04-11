package Day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -214748648; // en kucuk int number, user bundan buyuk bır sayı gırmelı...

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num > max){
                max = num;
            }

        }

        System.out.println("max = " + max);




    }





    /*
    Write a program that asks the user tı enter a number for 5 times
    return the max number
     */
}
