package Day_32_ConstructorOverloading;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aron");
        Employee employee2 = new Employee("Harun",'M');
        Employee employee3 = new Employee("Muhtar",'M',"Instructor");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);





    }


}
