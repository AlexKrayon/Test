package Day_12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");

        String fullName = input.nextLine();

        System.out.println("Enter your language");
        String programing = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programing = " + programing);
        input.close();


    }
}
