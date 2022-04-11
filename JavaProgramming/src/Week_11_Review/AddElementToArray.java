package Week_11_Review;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {
        String [] browserType = {"Crone", "Edge"};
        String newBrowserOne = "Opera";
        browserType=addElement(browserType,newBrowserOne);
        System.out.println(Arrays.toString(browserType));

    }

    public static String [] addElement (String[] arr, String element){
        String [] newArray = new String [arr.length+1];
        int i = 0;
        for( ; i<arr.length;i++){
           newArray[i] = arr[i];
        }
        newArray[i] = element;
        return newArray;



    }



}
