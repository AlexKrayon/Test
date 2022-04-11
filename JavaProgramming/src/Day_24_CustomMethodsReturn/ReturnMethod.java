package Day_24_CustomMethodsReturn;

public class ReturnMethod {
    public static void main(String[] args) {
        String str = "Java";
        String result = reverse(str);
        System.out.println(result);



    }
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


}
