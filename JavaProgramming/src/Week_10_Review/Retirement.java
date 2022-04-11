package Week_10_Review;

public class Retirement {
    public static void main(String[] args) {
        yearsUntilRetirement("Ali", 1980);
    }

    public static int calculateAge(int yearOfBirth){
        return 2022-yearOfBirth;
    }

    public static void yearsUntilRetirement (String name, int yearOfBirth){
        int yearsUntilRetirement = 65 - calculateAge(yearOfBirth);
        System.out.println(name+ " retires in "+yearsUntilRetirement+ " years");
    }

}
