package Week_10_Review;

public class HighScore {
    public static void main(String[] args) {
        displayHighScore("Fatih", 1 );

        int x = calculateHighScore(600);
        displayHighScore("Ali", x);
        displayHighScore("Ali", calculateHighScore(600));
    }

    public static void displayHighScore(String name, int position){
        System.out.println(name+" managed to get into position "+position+" on the high score table");
    }

    public static int calculateHighScore (int playerScore){
        if(playerScore>=1000){
            return 1;
        }else if(playerScore>=500 && playerScore< 1000){
            return 2;
        }else if(playerScore>=100 && playerScore<500){
            return 3;
        }else return 4;

    }

}
