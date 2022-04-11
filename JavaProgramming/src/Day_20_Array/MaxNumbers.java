package Day_20_Array;

public class MaxNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 7, 1};
        int max = numbers[0];


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }




        }
        System.out.print(max);
    }
}
