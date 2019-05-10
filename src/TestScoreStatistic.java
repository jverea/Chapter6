public class TestScoreStatistic {

    public static void main (String [] args){
        int high = 0;
        int low = 100;
        int ScoreEnterd;
        System.out.println("Enter test score");

        if (ScoreEnterd > high){
            high = ScoreEnterd;
        }
        else if (ScoreEnterd < low){
            low = ScoreEnterd;

        }
    }
}