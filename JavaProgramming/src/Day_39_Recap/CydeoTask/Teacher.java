package Day_39_Recap.CydeoTask;

public class Teacher extends Employee {
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching.");
    }
}
