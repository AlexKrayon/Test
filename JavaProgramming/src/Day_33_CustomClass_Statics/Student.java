package Day_33_CustomClass_Statics;

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
