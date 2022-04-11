package Day8_LogicalOp_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Haydar";
        int age = 15;
        String Citizen = "Turkey";

        boolean isEligible = age >= 18 && Citizen == "Turkey";

        System.out.println( name + " is eligible to vote: "+ isEligible);
        System.out.println("---------------------------------");

        String name2 = "Ali";
        int creditScore = 850;
        int age2 = 25;
        int income = 40000;
        boolean isEligible2 = creditScore >= 800 && age2 >= 25 && income >= 45000;
        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("---------------------------------");

        String name3 = "Sharen";
        int age3 = 22;
        char gender = 'F';

        boolean isEligible3 = age3 >= 20 && (gender == 'M' || gender == 'F');

        System.out.println( name3 + " is eligible for register: " + isEligible3);

        boolean isEligible4 = age3 >= 20 && (gender == 'M');
        System.out.println( name3 + " is eligible for register: " + isEligible4);


        System.out.println("---------------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible5 = countryOfBirth == "USA" || marriedToUSCitizen == false;
        System.out.println(name4 + " is eligible to apply: "+ isEligible5);

        System.out.println("---------------------------------");

        String student = "Anna";
        double gpa = 3.6;
        int familyIncome = 90000;
        boolean isEligible6= gpa >= 3.6 || familyIncome <= 100000;

        System.out.println(student + " is eligible for scholarship: " + isEligible6);

        System.out.println("---------------------------------");
        
        boolean result2 = true;
        System.out.println("result2 = " + result2);;
        
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("---------------------------------");

        int score =85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);










    }
}
