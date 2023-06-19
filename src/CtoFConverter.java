import java.sql.SQLOutput;
import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double Fahrenheit = 0;
        double Celsius = 0;
        boolean run = true;

        run = false;
       do {
           System.out.print("Enter temperature in Celsius: ");
           if (in.hasNextInt()) ;
           Celsius = in.nextInt();
           Fahrenheit = (Celsius * 9 / 5) + 32;
           System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
           System.out.println("Would you like to run the program again? ");
           run = in.nextBoolean();
       }
       while (run);
}
}