package Day_24_CustomMethodsReturn;

public class ReturnPractice {
    public static void main(String[] args) {
        int maxNumber = max(100,160);
        System.out.println(maxNumber);

        int multi = maxNumber * 2;
        System.out.println(multi);

    }

    public static int max (int a, int b){
        int result = 0;
        if(a>b){
            result = a;
        }else{
            result = b;
        }


        return result;
    }



}
