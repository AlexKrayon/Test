package Day16_ForLoopPractice;

public class RemoveDublicate {
    public static void main(String[] args) {

        String str = "aaabbaacc";
        String result = "";

        for (int i = 0; i <= str.length()-1 ; i++) {  //  veya   int i = 0; i < str.length(); i++
            String ch = ""+ str.charAt(i); // veya String ch = ""+ str.charAt(i) vye char ch = str.charAt(i);

            if(!result.contains(ch)) {

                result += ch;
            }
        }


        System.out.println(result);
    }
}
