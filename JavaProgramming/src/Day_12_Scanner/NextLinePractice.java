package Day_12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter GPA");
        double gpa = input.nextDouble();
        input.nextLine();

        System.out.println("School name: ");
        String schoolName = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);
        input.close();



    }
}
