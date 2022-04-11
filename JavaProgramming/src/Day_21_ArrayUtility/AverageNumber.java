package Day_21_ArrayUtility;

public class AverageNumber {
    public static void main(String[] args) {

        int[] num = {10,20,30,40,50,60,70,80};
        double sum = 0;

        for (int number : num) {
            sum += number;
        }
        
        double average = sum / num.length;
        System.out.println("average = " + average);
        
    }
}
