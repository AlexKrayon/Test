package Day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("-------------------------------------");

        String sen = "My favorite programming language is Java";

        boolean hasCS = sen.contains("C&");
        boolean hasJ = sen.contains("java");
        boolean has2 = sen.toLowerCase().contains("java"); // Bu durumda harfleri lower case yapar ve ona göre sonucu belirtir.

        System.out.println(hasCS);
        System.out.println(hasJ);
        System.out.println(has2);

        System.out.println("------------------------------------------");

        String in1 = "I love JavA";
        String in2 = "java";

        System.out.println(in1.equals(in2));
        System.out.println(in1.equalsIgnoreCase(in2));


        System.out.println(in1.toLowerCase().contains("java"));
        System.out.println(in1.toUpperCase().contains("JAVA"));








    }
}
