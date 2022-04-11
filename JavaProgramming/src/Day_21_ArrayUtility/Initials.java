package Day_21_ArrayUtility;

public class Initials {
    public static void main(String[] args) {
        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "API Testing", "Ahmet Deli"};

        for (String each : names) {
            String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1)+".";
            System.out.println(initial);
        }


    }
}
