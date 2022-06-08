package Day_53_FunctionalInterface_Stream;

import Day_52_Map_FunctionalInterface_Lambda.MySecondFunctionalInterface;

public class LambdaExpression {
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse = (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
        };

        String result = stringReverse.method("Melasoft");
        System.out.println(result);


        MyThirdFunctionalInterface<Integer> cube = n -> {
            System.out.println(n*n*n);

            return n;

        };
        cube.method(3);






    }
}
