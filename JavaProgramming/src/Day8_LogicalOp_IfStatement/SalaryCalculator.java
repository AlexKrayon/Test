package Day8_LogicalOp_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 65,
                weeklyHours = 40;

        double stateTaxRate = 9.5,
                federalTaxRate = 22.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100 ;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println( "Gross pay is: $ "+ salaryBeforeTax);
        System.out.println( "State tax : $ " + stateTax);
        System.out.println("Federal tax : $ " + federalTax);
        System.out.println(" Total tax : $ " + totalTax);
        System.out.println("Net income : $ "+ salaryAfterTax);







    }
}
