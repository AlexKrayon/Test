package Day5_Concateration;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Hayri";
        String lastName = "Reize";
        int age = 65;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + " and his salary is $" + salary);
    }
}
