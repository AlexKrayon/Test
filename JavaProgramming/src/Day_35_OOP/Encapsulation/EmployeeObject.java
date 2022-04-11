package Day_35_OOP.Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali", 'M',90,110000);

        System.out.println(employee1);

        employee1.setAge(25);
        System.out.println(employee1);

        Employee employee2 = new Employee("Ahmet", 'M',30,110000);

        employee2.setName("haluk");

        System.out.println(employee2);



    }





}
