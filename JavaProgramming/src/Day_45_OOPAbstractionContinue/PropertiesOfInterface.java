package Day_45_OOPAbstractionContinue;

public abstract class PropertiesOfInterface {
    int a;
    static int b;

    public PropertiesOfInterface(int a){
        this.a = a;
    }
    static {
        b=100;
    }
    public void method1(){
        System.out.println("Instance method");
    }

    public static void method2(){
        System.out.println("Static method");
    }
    public abstract void method3();


}
