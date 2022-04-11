package Day_30_CustomClass;

public class Employees {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int ID, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){

        System.out.println(jobTitle+ " "+name+" is working.");
    }



}
