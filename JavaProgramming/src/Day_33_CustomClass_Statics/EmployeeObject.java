package Day_33_CustomClass_Statics;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name= "Ahmet";

        Employee employee2 = new Employee();
        employee2.name= "Veli";

        Employee employee3 = new Employee();
        employee3.name= "Zafer";

        System.out.println(employee1.name); // static olunca en sondaki veriyi kabul eder ve Zafer yazar.




    }


}
