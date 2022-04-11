package Day_25_CustomMethodsRecaps;

import Utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programing Language";

        StringUtility.printEachChar(str);

        System.out.println("----------------------------");

        String s1 = "FATIH BALCI";
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("-------------------------------------");
        
        String word = "civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------------------------");

        String [] names = {"Anna", "Java", "racecar", "mom", "cydeo"};
        int count = 0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
    }




}
