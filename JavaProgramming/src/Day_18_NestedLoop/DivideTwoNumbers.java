package Day_18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 50;
        int b = 5;

        int count = 0;

        while (a >=b){
            a -= b;
            count++;

        }
        System.out.println(a+" / "+b);

        System.out.println(count+" with a remainder of "+a);
    }




}
