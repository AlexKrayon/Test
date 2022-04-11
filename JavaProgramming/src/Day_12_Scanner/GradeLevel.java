package Day_12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 20;

        String result;
        if (number >= 1 && number <= 18) {
            switch (number) {
                case 6:
                case 7:
                case 8:
                    result = "Middle school";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result = "High school";
                    break;

                case 13:
                case 14:
                case 15:
                case 16:
                    result = "College";
                    break;
                case 17:
                case 18:
                    result = "Grade School";
                    break;
                default:
                    result = "Elementary school";
            }


        } else {
            result = "Invalid Grade.";
        }
        System.out.println(result);


    }
}
