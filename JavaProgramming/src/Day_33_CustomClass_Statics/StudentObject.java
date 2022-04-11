package Day_33_CustomClass_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Ahmet",'M',32,123,'A');
        Student student2 = new Student("Ayşe",'F');
        Student student3 = new Student("Ali",345);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("-------------------------------");

        Student[] students = {student1,student2,student3};

        System.out.println(Arrays.toString(students));










    }
}
