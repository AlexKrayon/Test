package Day_30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Ali",'M', 18,26,'A');
        //System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Ayşe",'F', 18,36,'B');
        //System.out.println(student2);

        Student student3 = new Student();
        student3.setInfo("Tahir",'M', 20,28,'A');
        //System.out.println(student3);

        Student student4 = new Student();
        student4.setInfo("Veli",'M', 17,32,'D');
       // System.out.println(student4);

        Student student5 = new Student();
        student5.setInfo("Fatma",'F', 19,34,'B');
        //System.out.println(student5);

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade : A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        student1.code();
        student3.sleep();



    }
}
