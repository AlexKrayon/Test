package Day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        String str = "xcodeX";
        System.out.println(str);

       String result =  str.replace("x", "a").replace("X", "a");
        System.out.println(result);
    }
}
