package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayandArrayList {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] result= new int[arr.length];
        int j =0;
        for (int i = arr.length-1; i >=0 ; i--, j ++) {
            result[j] = arr[i];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("----------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            int each = list.get(i);
            reverseList.add(each);
        }

        System.out.println(reverseList);





    }
}
