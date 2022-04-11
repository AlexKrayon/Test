package Day_27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {
        int num1 = 200;

        Integer n1 = num1; // autoboxing
        int num2 = n1; // unboxing

        Byte b1= 25; // NOT: wrapper classtakiler tüm primitivelere aktarılabilir.
                        // Fakat primitivler sadece kendi cinsinden olan wrapper classa aktarılabilir.
        byte a1=b1;
        short a2=b1;
        int a3=b1;
        long a4= b1;


    }



}
