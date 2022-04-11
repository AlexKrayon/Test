package Day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 10;

        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
               break;                           // break olmazsa bir sonrakine geçer,
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satuday");
                break;
            case 7:
                System.out.println("SUnday");
                break;
            default:
                System.out.println("Invalid");



        }
    }
}
