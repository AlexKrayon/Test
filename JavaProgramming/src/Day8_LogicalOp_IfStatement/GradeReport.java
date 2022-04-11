package Day8_LogicalOp_IfStatement;

import java.sql.SQLOutput;

public class GradeReport {
    public static void main(String[] args) {

        /*
         System.out.println( true == !false); // true
        System.out.println( !true != false); // false
        System.out.println( !false == true); // true

        System.out.println(!!false); //false
        System.out.println( !!!true); //false
         */

       int score =95; // grade scores 0 to 100

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89; //score >= 80 && !a; bu sekilde de yazılabılır.
        boolean c = score >= 70 && score <= 79; // !a && !b && score >= 70
        boolean d = score >= 60 && score <= 69; //
        boolean e = score >= 0 && score <= 59; // boolean e = !a && !b && !c && !d:

        if(a) {
            System.out.println("Excellent");
        }
        if (b) {
            System.out.println("Great");
        }
        if(c) {
            System.out.println("Good");
        }
        if(d) {
            System.out.println("Passed");
        }
        if(e) {

            System.out.println("Failed");
        }





    }
}
