package Day_41_Exceptions;

import Day_39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {
        Employee employee= null;

        try {
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Forth catch block");
            e.printStackTrace();
        }



    }
}
