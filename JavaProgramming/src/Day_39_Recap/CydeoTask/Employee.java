package Day_39_Recap.CydeoTask;

public class Employee extends Person{

    private int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<=0){
            System.err.println(id +" is an invalid employee id.");
            System.exit(0);
        }
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=10){
            System.out.println("Invalid entry, try again later.");
            System.exit(0);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working.");
    }

    public String toString() {
        return "Employee{" +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}
