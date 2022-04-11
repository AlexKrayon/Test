package Day_20_Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number: ");
            num[i] = scan.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];

            }

            System.out.println("num = " + Arrays.toString(num));

            System.out.println("min = " + min);
            System.out.println("max = " + max);


        }
    }
}
