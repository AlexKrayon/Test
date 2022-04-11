package Day16_ForLoopPractice;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        String st = "Aghbshgmn2456kjkj3455nkgsb%%%&&&???BFJJDhfjhjd";

        String digit = "",
                letters = "",
                specials = "";

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);


            if (c >= '0' && c <= '9') {
                digit += c;
            } else if (c >= 'A' && c <= 'Z') {
                letters += c;
            } else if (c >= 'a' && c <= 'z') {
                letters += c;
            } else {
                specials += c;
            }




        }
        System.out.println(st);

        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("specials = " + specials);

    }


}
