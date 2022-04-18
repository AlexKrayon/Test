package Day_41_Exceptions;

import java.io.FileInputStream;
import java.util.Locale;

public class CheckedVSUnchecked {
    public static void main(String[] args) {

        //unchecked exceptions
        int a= 10;
        int b= 0; // 2 versem hata olusmaz

      //  System.out.println(a / b); // exception occurs during the ru time.


        char[]chars={'A','B','C'};
        //System.out.println(chars[9]);// runtime de hata veriyor.

        String str = "Ali Veli";
        str=null; // null verildiği için unchecked exception olustu.
        //System.out.println(str.toLowerCase());

        //checked exceptions

        //System.out.println("hello")

       // FileInputStream file = new FileInputStream("Ali");


    }


}
