package Day_20_Array;

public class MinNum {
    public static void main(String[] args) {
        int [] num = {100, 6, 34,78,25,900,63,12};

        int min = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println(min);


    }
}
