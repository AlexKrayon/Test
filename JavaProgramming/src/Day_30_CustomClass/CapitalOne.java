package Day_30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {
        Employees employees1 = new Employees();
        Employees employees2 = new Employees();
        Employees employees3 = new Employees();
        Employees employees4 = new Employees();
        Employees employees5 = new Employees();

        employees1.setInfo("Ahmet",'M',27,345,"Developer",100000, true);
        employees2.setInfo("Veli",'M',29,344,"QA",100000, true);
        employees3.setInfo("Ayşe",'F',20,245,"Stajyer",80000, false);
        employees4.setInfo("Fatma",'F',37,145,"Manager",150000, true);
        employees5.setInfo("David",'M',28,355,"Developer",110000, true);

        Employees[] employees = {employees1,employees2,employees3,employees4,employees5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employees employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(employee.salary>max){
                max=employee.salary;
            }
            if(employee.salary< max){
                min = employee.salary;
            }
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        employees4.work();


    }
}
