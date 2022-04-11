package Day_21_ArrayUtility;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "API Testing", "Ahmet Deli"};
        for (String each : names){
            String reversed = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }


    }
}
