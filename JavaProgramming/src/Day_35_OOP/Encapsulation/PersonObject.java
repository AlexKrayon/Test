package Day_35_OOP.Encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
       // p1.name = "Ali"; Bu sekilde olunca compıle error veriyor.
        // p1.age = 28;

        p1.setName("Ali");
        p1.setAge(28);

        p2.setName("Ahmet");
        p2.setAge(20);

        System.out.println(p1.getName()+" : "+p1.getAge());
        System.out.println(p2.getName()+" : "+p2.getAge());



    }
}
