package Day_24_CustomMethodsReturn;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
        String str = "aabcccdeee";
        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
            if(frequency == 1){
                System.out.println(str.charAt(i));
            }
        }


    }
    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }



}
