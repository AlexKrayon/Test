import java.util.Arrays;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int id;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int id) {
        this(name);
        this.id = id;
    }

    public Student(String name, char gender, int id) {
        this(name, gender);
        this.id = id;
    }

    public Student(String name, char gender, int age, int id) {
        this(name, gender, id);
        this.age = age;
    }

    public Student(String name, char gender, int age, int id, char grade) {
        this(name, gender, age, id);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }


}

class StudentObject{

    public static void main(String[] args) {

        Day_33_CustomClass_Statics.Student student1 = new Day_33_CustomClass_Statics.Student("Ahmet",'M',32,123,'A');
        Day_33_CustomClass_Statics.Student student2 = new Day_33_CustomClass_Statics.Student("Ayşe",'F');
        Day_33_CustomClass_Statics.Student student3 = new Day_33_CustomClass_Statics.Student("Ali",345);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("-------------------------------");

        Day_33_CustomClass_Statics.Student[] students = {student1,student2,student3};

        System.out.println(Arrays.toString(students));



    }
}
