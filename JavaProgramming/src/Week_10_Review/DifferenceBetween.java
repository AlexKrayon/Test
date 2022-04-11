package Week_10_Review;

public class DifferenceBetween {
    public static void main(String[] args) {
        int[]arr= {1,5,7,12,67,43,90,45};
        System.out.println(difference(arr));
    }
    public static int difference(int[]arr){
        int diff = 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        diff = max-min;
        return diff;


    }


}
