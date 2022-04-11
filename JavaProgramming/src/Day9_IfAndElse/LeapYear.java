package Day9_IfAndElse;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;
        boolean leapYear = year % 4 == 0;
        if(leapYear){
            System.out.println("Year "+ year + " is a leap Year.");
        }else{
            System.out.println("Year "+ year + " is NOT a leap Year.");
        }


    }
}
