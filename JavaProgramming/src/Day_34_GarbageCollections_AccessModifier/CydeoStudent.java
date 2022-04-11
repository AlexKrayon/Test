package Day_34_GarbageCollections_AccessModifier;

public class CydeoStudent {
    public String studentName;
    public static String schoolName; // = "Cydeo School" olarak yazılabilir

        public CydeoStudent(String studentName){
        this.studentName = studentName;
        //schoolName = "Cydeo School";
    }
    static {
            schoolName = "Cydeo School"; // Bu şekilde de olur...
    }

}

class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Nabi");
        CydeoStudent student2 = new CydeoStudent("Baby");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);


    }

}