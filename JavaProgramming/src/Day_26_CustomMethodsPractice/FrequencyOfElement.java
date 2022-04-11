package Day_26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,4,4,4,4,4,5,5,1,1,4,4,3};
        int n = frequencyOfElement(arr, 4);
        System.out.println(n);
    }
    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[]array, int element){
    int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[]array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }


    public static int frequencyOfElement(char[]array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[]array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }



}
