package Day11_Switch_Scanner;

public class NameOfMonth {
    public static void main(String[] args) {
        int number = 2;
        int year = 2002;
        String result = "";

        if (number >= 1 && number <= 12) {

            switch (number) {
                case 2:

                        result = (year % 4 == 0)? " 29 days": " 28 days";
                                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                   result = " 30 days";
                    break;

                default:
                    result = " 31 days";

            }


        } else {
            result = "Invalid Number";
        }
        System.out.println(result);

    }
}
