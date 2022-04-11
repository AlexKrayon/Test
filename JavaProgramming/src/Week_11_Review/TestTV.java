package Week_11_Review;

import java.util.ArrayList;

public class TestTV {
    public static void main(String[] args) {
        TV Samsung = new TV();
        System.out.println(Samsung.toString());

        Samsung.turnOn();
        Samsung.setChannel(8);
        Samsung.setVolume(3);
        System.out.println(Samsung.toString());

        Samsung.turnOn();
        Samsung.setChannel(8);
        Samsung.setVolume(3);
        System.out.println(Samsung.toString());

        Samsung.turnOn();
        Samsung.setChannel(8);
        Samsung.setVolume(3);
        System.out.println(Samsung.toString());


        ArrayList<TV> list = new ArrayList<>();

    }


}
