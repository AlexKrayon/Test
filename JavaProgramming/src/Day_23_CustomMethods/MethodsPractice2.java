package Day_23_CustomMethods;

public class MethodsPractice2 {
    public static void main(String[] args) {
        helloworld();
        cydeo();
        evenNm();
    }

    public static void helloworld(){
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Hello World");
        }

    }

    public static void cydeo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello Cydeo,"+" Selam");
        }
    }

    public static void evenNm(){
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i+", ");
        }

    }





}
