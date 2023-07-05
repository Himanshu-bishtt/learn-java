public class Hello {
    public static void main(String[] args) {
        // player tom
        displayHighScorePosition("Tom", calculateHighScorePosition(1500));
        // player himanshu
        displayHighScorePosition("Himanshu", calculateHighScorePosition(1000));
        // player rahul
        displayHighScorePosition("Rahul", calculateHighScorePosition(500));
        // player karan
        displayHighScorePosition("karan", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table" );
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500) {
            return 2;
        } else if(playerScore >= 100)  {
            return 3;
        } else {
            return 4;
        }
    }
}
