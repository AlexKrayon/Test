package Week6_Review;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a valid number: ");
        int number = input.nextInt();
        int sum = 0;
        boolean check = true;

        for( ; check;){
            if (number>=1){

                for (int i = 1; i <= number ; i++) {
                    sum += i;
                            }

                check = false;
        }else{
                System.out.println("Please enter a valid number: ");
                number=input.nextInt();
                check=true;
            }


        }


        System.out.println("sum = " + sum);








    }
}
