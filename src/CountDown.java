public class CountDown {
    public static void main (String [] args) {
        System.out.println("FINAL COUNTDOWN!!!!!!!");
        //In this class we are going to be using three types of looping structures.
        //We will start with a while loop
        int count = 10;
        while (count != 0) {

            System.out.println(count);
            --count;
        }
        int Count2 = 0;
        while (Count2 <= 10) {
            System.out.println(Count2);
            ++Count2;
        }
    }
    public static void displayDoWHile(){
        int count = 10;
        int Count2 = 0;

        do{
            System.out.println(count);
            -- count;
        }while (count >= 0);
        do{
            System.out.println(Count2);
            ++Count2;
        }while (Count2 <= 10);
    }
    public static void displayForLoop(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
            }
        }
}      