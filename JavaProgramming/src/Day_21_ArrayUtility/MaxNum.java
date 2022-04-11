package Day_21_ArrayUtility;

public class MaxNum {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 7, 1};
        int max = numbers[0];
        for (int number : numbers) {
            if(number>max){
                max=number;
            }
        }

        System.out.println(max);






    }
}
