package week_3_ReviewSection;

public class UnaryReview {
    public static void main(String[] args) {
        int a = 20;
        System.out.println("a++= "+ a++);
        int b = 20;
        System.out.println("++b = "+ ++b);
        int c = 20;
        System.out.println(++ c + 1);// 22
        int x = 12;
        if(++x>12){
            System.out.println("x in the if part : " + x);
        } else {
            System.out.println("x value in the ELSE statement :  "+x);
        }


    }
}
