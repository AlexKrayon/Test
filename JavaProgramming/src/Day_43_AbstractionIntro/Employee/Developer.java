package Day_43_AbstractionIntro.Employee;

public final class Developer extends Employee {

    public Developer(String name, int age, char gender, int id) {
        super(name, age, gender, id);
    }

    @Override
    public void work() {
        System.out.println(getName()+" works 8 hours.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 18 hours.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats borek.");
    }
}
