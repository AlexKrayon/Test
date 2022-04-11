package Day_20_Array;
import java.util.Arrays;
public class AverageNumbers {
    public static void main(String[] args) {

        int[] num = {10,20,30,40,50,60,70,80};
        double sum = 0;

        for (int i = 0; i < num.length; i++) {
           sum += num[i];
        }

        double averageNumber = sum/ num.length;
        System.out.println("num = " + Arrays.toString(num));
        System.out.println("averageNumber = " + averageNumber);


    }
}
