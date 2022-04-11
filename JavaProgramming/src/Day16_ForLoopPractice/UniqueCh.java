package Day16_ForLoopPractice;

public class UniqueCh {
    public static void main(String[] args) {
        String st = "aaaabccccdeeee";
        String result = "";

        for (int i = 0; i < st.length() ; i++) {
            char c = st.charAt(i);



            if(st.indexOf(c) == st.lastIndexOf(c)){
                result += c;

            }

        }

        System.out.println(result);





    }
}
