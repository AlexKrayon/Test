package Day8_LogicalOp_IfStatement;

public class SingleIfStatement {
    public static void main(String[] args) {

        int number = 301;
        /*
         System.out.println("Odd Number");
        System.out.println("Even Number");
         */

       boolean evenNumber = number%2 == 0;
       boolean oddNumber = ! evenNumber;

       if(evenNumber){
           System.out.println(number + " is even number.");
       }
       if(!evenNumber){
           System.out.println(number +" is odd number. ");

       }

        System.out.println("---------------------------------");

       int n = 200;

       if (n > 0){
           System.out.println(n + " is positive");
       }
       if (n < 0){
           System.out.println(n + " is negative");
       }




    }
}
