import java.util.Scanner;

public class TestScoreStatistic {

    public static void main (String [] args){
        int high = 0;
        int low = 100;
        int ScoreEnterd = 0;
        int average;
        int count = 0;
        int totalScore = 0;
        Scanner input = new Scanner(System.in);

        while(ScoreEnterd != 999) {
            System.out.println("Enter students test score to quit type 999");
            ScoreEnterd = input.nextInt();

            if (ScoreEnterd > high) {
                high = ScoreEnterd;
            } else if (ScoreEnterd < low) {
                low = ScoreEnterd;
            }
            count++;
            totalScore = totalScore + ScoreEnterd;
        }
        average = totalScore /count;
        System.out.println("Here is the average of the test scores." + average);
    }
}