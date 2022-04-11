package Day_35_OOP;

public class CydeoStudents {
    public String name;
    public int age;
    public char gender;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;

    public CydeoStudents(String name, int age, char gender, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="Cydeo School";
        programmingLanguage="JAVA";
    }

    public static void printSchoolName(){
        System.out.println("School is "+ schoolName);
    }

    public static void printProgrammingLanguage(){
        System.out.println("Language is "+ programmingLanguage);
    }

    public void attendClass(){
        System.out.println(name + " is attending class.");
    }
    public void study(){
        System.out.println(name + " is study.");
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\''+
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
