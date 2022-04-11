package Week_7_Review;

public class Task1 {
    public static void main(String[] args) {
        int row = 15;
        for (int i = 1; i <= row ; i++) {
            int value = i;

            for (int j = 1; j <=i ; j++) {
                System.out.print(value + " ");
                value+=row-j;
            }

            System.out.println();


        }



    }
}
