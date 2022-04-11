package Day_37_InheritanceContinue.AnimalTask.ScrumTask;

public class Employee extends Person {

    public String jobTitle, companyName;
    public int id;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle, String companyName, int id, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working.");
    }

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
