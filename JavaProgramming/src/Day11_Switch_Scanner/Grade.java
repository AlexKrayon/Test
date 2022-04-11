package Day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch = 'X';
        String result = "";

        switch (ch){
            case 'A':
                System.out.println("Excellent"); // yukarıya String result yazınca buralarda sadece reslt = "Excellent" yazılabilir.
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'E':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");


        }
    }
}
