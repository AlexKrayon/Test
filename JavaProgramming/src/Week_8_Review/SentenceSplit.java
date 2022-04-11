package Week_8_Review;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String searchResult = "1-16 of 829 results for Ipad";
        
        String [] each = searchResult.split(" ");
        System.out.println(Arrays.toString(each));
        
        String searchAmount = each[2];
        System.out.println("searchAmount = " + searchAmount);
        
        
        
    }
}
