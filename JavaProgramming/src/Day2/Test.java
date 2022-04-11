package Day2;


public class Test {
    public Test() {
        System.out.println("A ");
    }

    public Test(int a) {
        this(2.5);
        System.out.println("B ");
    }

    public Test(double c) {
        this();
        System.out.println("C ");
    }

    public static void main(String[] args) {
        Test obj = new Test(100);
    }
}