package Day_14_String2;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Ali");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "balci75@yahoo.com";
        String email2 = email.replace("yahoo","gmail");
        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);
        System.out.println("-----------------------------");

        String s = "Dog dog Dog dog DOg Dog Dog";
        s = s.replace(" Dog", " Cat");
        System.out.println("s = " + s);
        System.out.println("s = " + s);




    }
}
