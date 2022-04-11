package Day_21_ArrayUtility;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int [] num = {10,20,30,40,50,60,70};

        for (int i = 0; i < num.length; i++) {
            int each = num[i];
            System.out.println(each);
        }

        System.out.println("___________________________________");

        for (int each : num ) {
            System.out.println(each);
        }





    }
}
