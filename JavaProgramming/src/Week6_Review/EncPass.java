package Week6_Review;

public class EncPass {
    public static void main(String[] args) {
        String password = "cydeo";
        char encpass = 'x';
        String sonuc = "";

        for (int i = 0; i < password.length(); i++) {

            sonuc += ""+password.charAt(i)+encpass;


        }
        System.out.println("sonuc = " + sonuc);



    }
}
