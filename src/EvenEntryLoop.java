import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args) {
        int userEntry;
        String reslut;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in an even number");
        userEntry = input.nextInt(  );

        if (userEntry % 2 == 0) {
            reslut = userEntry + "Good job!";
        } else
            reslut = userEntry + "Is not even";
    

            System.out.println(reslut);

        }
}
