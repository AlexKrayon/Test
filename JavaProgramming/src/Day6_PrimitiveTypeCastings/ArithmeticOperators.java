package Day6_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
        + = addition
        - = subtract
        * = multiplication
        / = division
        % = remainder
         */

        System.out.println("12"+1); //121
        System.out.println(10+20);  //30
        System.out.println(100-40); //60
        System.out.println(10*6); //60
        System.out.println(100/3); //33
        System.out.println(10/4);  //2
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5
        System.out.println(10d / 4); //2.5

        int a = 100;
        double b = a/6;
        System.out.println(b);

        double c = a / 6.0; // 16.666
        System.out.println(c);

        double z = (double)a/6;
        System.out.println(z);



    }
}
