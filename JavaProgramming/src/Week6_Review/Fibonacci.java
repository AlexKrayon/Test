package Week6_Review;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");

        int n =  scan.nextInt();

        int num1 = 0, num2 =1;
        int sum;
        String series = ""+num1+" "+num2+" ";
        for (int i = 2; i < n; i++) {
            sum = num1+num2;
            num1=num2;
            num2=sum;
            series += sum+" ";

        }

        System.out.println("series = " + series);
        System.out.println("Final number in the sequence is "+num2);




    }
}
