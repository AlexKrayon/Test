package Day_37_InheritanceContinue.AnimalTask.ScrumTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String jobTitle, String companyName, int id, double salary) {
        super(name, age, gender, jobTitle, companyName, id, salary);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket.");
    }



}
