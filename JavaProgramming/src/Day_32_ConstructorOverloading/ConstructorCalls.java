package Day_32_ConstructorOverloading;

public class ConstructorCalls {

    public ConstructorCalls(){

        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this(); // simdi error vermiyor.
        System.out.println("Constructor with int argument");
        // this(); error veriyor, cunku ilk sırada olmalı.
    }

    public ConstructorCalls(String str){
        this(10);

        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("-------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        ConstructorCalls obj3 = new ConstructorCalls("Java");



    }




}
