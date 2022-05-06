package Day_43_AbstractionIntro.Employee;

public abstract class Employee extends Person {
    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id) {
        super(name, age, gender);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getJobTitle(String jobTitle) {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                "age=" + getAge() +
                "gender=" + getGender() +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
