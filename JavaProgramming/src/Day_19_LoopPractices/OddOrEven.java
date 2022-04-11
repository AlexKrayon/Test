package Day_19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a umber: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            System.out.println("Would you like to enter another number? (Yes/No)");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("Yes") || a.equalsIgnoreCase("No"))) {
                System.err.println("Sorry! Invalid entry");
                System.exit(0);
            }


            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you!!!");
                break;
            }

        }


    }
}

