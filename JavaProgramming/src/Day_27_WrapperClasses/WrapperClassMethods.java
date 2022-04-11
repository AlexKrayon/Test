package Day_27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "64";

        int num = Integer.parseInt(str);
        System.out.println(num+1);
        System.out.println(str +1);
        System.out.println("---------------------");

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 +1);

        System.out.println("-----------------------");

        int max = Integer.MAX_VALUE; // Integer primitivein max ve min sayılarını verir.
        int min = Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("-------------------");

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        System.out.println("-------------------");
        String s1 = "asd";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("-------------------");

        String s2 = "123321";
        Integer x = Integer.valueOf(s2);
        System.out.println(x);

        System.out.println("-------------------");

        char ch1 = 'A';
        boolean r2 = Character.isDigit(ch1); // isDigit / isLetter / isSpecialCharacter
        boolean r3= Character.isLetter(ch1);
        boolean r4= !Character.isLetterOrDigit(ch1);
        boolean r5 = Character.isUpperCase(ch1);
        boolean r6 = Character.isLowerCase(ch1);


        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("-------------------");

        String s = "ab12cd3hgf4dscv5";
        int sum = 0;
        for (char each:s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum = " + sum);

    }
}
