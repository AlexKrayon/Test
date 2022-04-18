package Day_41_Exceptions;

public class tryCatchBlock {
    public static void main(String[] args) {
        System.out.println("Test started");
        try{
            System.out.println(9/0);
            System.out.println("Try block");
        }catch(ArithmeticException e){
            System.out.println("Catch block");

            System.out.println("Aritmetic Exception was occured");

        }


        System.out.println("Test completed");
        System.out.println("--------------------------");
        System.out.println("--------------------------");

        System.out.println("Test2 started");

        int [] num={1,2,3,4,5};

        try {
            System.out.println(num[20]);
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");

            System.out.println("Run time exception was occured.");
        }

        System.out.println("Test2 Completed");

        System.out.println("--------------------------");
        System.out.println("--------------------------");

        System.out.println("Test3 started");

        try {
            System.out.println("Cydeo".substring(2,0));

        }catch (RuntimeException e){
            e.printStackTrace();



        }

        System.out.println("Test3 Completed");



    }
}
