package Day_29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,70,90,35,75,95,55,100,85,45,35,60,65));
        Collections.sort(scores);
        System.out.println(scores);

        ArrayList<Integer> gradeA = new ArrayList<>(scores);
        gradeA.removeIf(p-> !(p >= 90 && p <=100));
        System.out.println(gradeA);
        System.out.println("gradeA = " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(scores);
        gradeB.removeIf(p-> !(p >= 80 && p <=89));
        System.out.println(gradeB);
        System.out.println("gradeB = " + gradeB);



        ArrayList<Integer> gradeC = new ArrayList<>(scores);
        gradeC.removeIf(p-> !(p >= 70 && p <=79));
        System.out.println(gradeC);
        System.out.println("gradeC = " + gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>(scores);
        gradeD.removeIf(p-> !(p >= 60 && p <=69));
        System.out.println(gradeD);
        System.out.println("gradeD = " + gradeD);

        ArrayList<Integer> gradeE = new ArrayList<>(scores);
        gradeE.removeIf(p-> !(p >= 0 && p <=59));
        System.out.println(gradeE);
        System.out.println("gradeE = " + gradeE);

        System.out.println("Total number of A: " + gradeA.size());
        System.out.println("Total number of B: " + gradeB.size());
        System.out.println("Total number of C: " + gradeC.size());
        System.out.println("Total number of D: " + gradeD.size());
        System.out.println("Total number of E: " + gradeE.size());





    }
}
