package Day_39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Ali",23,'M', 54,"Java", 120000);

        Tester tester = new Tester("Olga",19,'F', 78, "SDET", 100000);

        Teacher teacher= new Teacher("Ahmet",56, 'M', 35,"Math Teacher", 87000);

        Student student = new Student("Ayse",17,'F',13,"Computer");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        developer.setAge(78);
        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        student.eat();
        teacher.drink();
        developer.sleep();








    }
}
