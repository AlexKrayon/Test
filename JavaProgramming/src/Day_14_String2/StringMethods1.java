package Day_14_String2;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "     batch       67           ";

        str1 = str1.trim();

        System.out.println("str1 = " + str1);

        String str2 = " Dubuque School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); // ilk o harfini veriri.
        System.out.println("n2 = " + n2);

        int n4 = str2.indexOf("qu");
        System.out.println("n4 = " + n4);

        int n5 = str2.lastIndexOf("o");
        System.out.println("n5 = " + n5);

        System.out.println("------------------------------");

        String se = "Ali geldi ata bindi.";
        int firstA = se.indexOf("a");
        System.out.println("firstA = " + firstA);
        int secondA = se.indexOf("a b");
        System.out.println("secondA = " + secondA);




    }
}
