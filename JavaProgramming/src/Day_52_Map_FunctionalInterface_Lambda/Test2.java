package Day_52_Map_FunctionalInterface_Lambda;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface< String > printEach;
        printEach = i -> {
            for (String each : i.split("")) {
                System.out.println(each);
            }
        };
        printEach.test("Melasoft");


        MySecondFunctionalInterface<Integer> cube;
        cube= n-> {
            System.out.println(n*n*n);
        };
        cube.test(3);



    }
}
