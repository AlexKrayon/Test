package Day_39_Recap.CydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing the application.");
    }


}
