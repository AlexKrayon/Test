package Week_Two_Review;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
        String name = "Ahmet";

        // 1- Create your scanner object - 1 and 3 not optional, have to do
        // 2- prompt the user for putting input
        // 3- Get the input

        Scanner input = new Scanner(System.in);
        System.out.println("Put your name : ");

        name = input.next();

        System.out.println("name = " + name);



    }
}
