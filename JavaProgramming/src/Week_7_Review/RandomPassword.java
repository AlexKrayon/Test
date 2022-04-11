package Week_7_Review;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "AAANNBHGFFVBJJGVjkskjgfnşksauhşşkkj542628934&%>>>***";
        System.out.println(source.length());

        String password = "";

        Random random = new Random();

        for (int i = 1; i <=12 ; i++) {
            int index = random.nextInt(52);
            System.out.println("index = "+index);
            password+=source.charAt(index);


        }

        System.out.println("password = " + password);



    }
}
