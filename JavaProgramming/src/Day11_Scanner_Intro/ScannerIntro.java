package Day11_Scanner_Intro;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int num1 = input.nextInt();
        System.out.println("Enter a decimal number : ");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication : "+ (num1*num2) );

        input.close();



    }



}
