import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int computerPick = 5;
        int pickANumber = 0;
        boolean playAgain;

        System.out.println("Think of a number between 1-10. ");
        computerPick = in.nextInt();

        do {
            System.out.println("Is your number" +computerPick + " ? ");
            if (computerPick >5)
                System.out.println("Enter a plus sign." );
                computerPick = computerPick +1;


        }while (playAgain = true);

    }
}
