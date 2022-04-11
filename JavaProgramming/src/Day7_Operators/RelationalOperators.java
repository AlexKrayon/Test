package Day7_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean result1 = 20 > 40; //false
        System.out.println("result1 = " + result1);
        boolean result2 = 200 > 40; //true
        System.out.println("result2 = " + result2);
        boolean result3 = 200 >= 40; //true
        System.out.println("result3 = " + result3);
        boolean result4 = 200 >= 400;
        System.out.println("result4 = " + result4);

        // credit score of 720
        int creditScore = 745;

        boolean isEligiableForLoan = creditScore >= 720;
        System.out.println("isEligiableForLoan = " + isEligiableForLoan);

        int score = 70;
        boolean hasPassed = score <= 58;
        System.out.println("hasPassed = " + hasPassed);

        System.out.println("_____________________________");

        int X = 1000;
        int Y = 2000;

        boolean equal = X == Y;
        System.out.println("equal = " + equal);

        boolean result8 = "Good Guy" == "Good Guy";
        System.out.println("result8 = " + result8);

        boolean result9 = "Muhtar" != "Good Guy";
        System.out.println("result9 = " + result9);

        boolean result10 = 300 != 300;
        System.out.println("result10 = " + result10);


    }
}
