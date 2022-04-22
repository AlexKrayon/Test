package Day_42_ExceptionContinue;

import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        String[] name = {"Os", "Muh", "Sav"};
        String[] name1 = {"car", "tar", "cı"};

        String[] add = new String[name.length];
       /* int j = 0;
        for (String s : add) {
            s += name[j] + name1[j];
            j++;
        }*/

        for (int i = 0; i < add.length ; i++) {
            add[i]=name[i]+name1[i];

        }

        System.out.println(Arrays.toString(add));

    }

}



      //  [Oscar,Muhtar,Savcı]

