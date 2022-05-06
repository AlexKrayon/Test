package Day_43_AbstractionIntro.Employee;

public class Tester extends Employee {


    public Tester(String name, int age, char gender, int id) {
        super(name, age, gender, id);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is doing job");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats baklawa.");
    }
}
