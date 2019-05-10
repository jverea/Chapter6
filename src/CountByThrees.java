import java.util.Scanner;

public class CountByThrees {

    public static void main(String[] args) {
        countByUserChoice();
    }

    public static void countbyThrees() {
        System.out.println("Printing 3 to 300 how much fun is this!!!");
        for (int i = 3; i <= 300; i = i + 3) {
            System.out.print(i + " ");
            if (i % 30 == 0) {
                System.out.println();
            }
        }
    }
    public static void countByUserChoice(){
        Scanner input = new Scanner(System.in);
        int userChoice=0;
        int userChoiceHigh;
        int count = 0;

        while (userChoice != 999){
            System.out.println("User chooses number to count by");
            userChoice = input.nextInt();
            System.out.println("User chooses a number to count too must be higher than first number");
            userChoiceHigh = input.nextInt();
            for (int i =0; i <= userChoiceHigh; i = userChoice + i){
                count ++;
                if (count % 10 == 0){
                    System.out.println(i);
                }
                else
                    System.out.print(i + " ");
            }
        }
    }
}
