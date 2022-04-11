package Day_23_CustomMethods;

public class CustomMethodParameters {
    public static void main(String[] args) {
        oddEven(11);

    }
    public static void oddEven(int number){
        if(number %2==0){
            System.out.println(number+" is even number.");
        }else{
            System.out.println(number+" is odd number.");
        }
    }




}
