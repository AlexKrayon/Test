package Day_39_Recap.CydeoTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bugs.");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing the application.");
    }
}
