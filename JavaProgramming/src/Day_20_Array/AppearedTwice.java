package Day_20_Array;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B', 'B', 'C', 'C', 'C', 'D'};

        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    frequency++;

                }
            }
            if (frequency == 2) {
                System.out.println(ch);
            }
        }
    }
}
