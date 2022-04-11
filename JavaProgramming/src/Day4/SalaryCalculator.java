package Day4;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 65;
        int weeklyRate = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyRate * numberOfWeeks;

        System.out.println("hourlyRate = $ " + hourlyRate);
        System.out.println("weeklyRate = " + weeklyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $ " + salary);


    }

}
