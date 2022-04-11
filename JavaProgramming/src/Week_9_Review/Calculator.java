package Week_9_Review;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2,20.5));
        double sum = add (4.0,5.0);
        System.out.println(sum);
    }

    public static double add(double num1, double num2){  // num1 and num2 are called pass by variables
        double result = num1+num2;
        return result;
    }

    public static double subtract(double num1, double num2){
        return num1-num2;
    }

    public static double multiply(double num1, double num2){
        return num1*num2;
    }

    public static double divide(double num1, double num2){
        return num1/num2;
    }
}
