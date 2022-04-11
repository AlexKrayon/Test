package Week_04_ReviewSection;

public class TernaryExample {
    public static void main(String[] args) {

        int score1 = 25;
        String result = "";

        if(score1 >60){
            result = "Passed";
        }else{
            result = "Failed";
        }
        System.out.println(" result =" + result);

        int score2 = 65;
        String result2 = (score2>60)? "Passed":"Failed";
        System.out.println("result2 = " + result2);


    }
}
