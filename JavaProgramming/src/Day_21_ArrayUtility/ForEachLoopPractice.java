package Day_21_ArrayUtility;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String [] words = {"Java Prog", "Cydeo School", "Early Bird","Ali Gel"};
        for (String each : words){
            System.out.println(each.charAt(0) + ""+each.charAt(each.length()-1));
        }







    }


}
