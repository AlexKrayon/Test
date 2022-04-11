package Day16_ForLoopPractice;

public class Reverse {
    public static void main(String[] args) {
        String str= "Okul basladı dun yine cocuklar gitti okula";
        String result ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);

        }


        System.out.println(str);
        System.out.println(result);
    }
}
