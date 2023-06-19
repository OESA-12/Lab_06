import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double inches = 0;
        double miles = 0;
        double meters = 0;
        double feet = 0;
        boolean perform = true;

        do {
            System.out.println("Enter the meters: ");
            meters = in.nextInt();
            inches = meters * 39.3700787;
            System.out.println("The total in inches is: " + inches);
            miles = meters * 0.00062137119;
            System.out.println("The total in miles is " + miles);
            feet = meters * 3.2808399;
            System.out.println("The total in feet is: " + feet);
            System.out.println("Run the program again? ");
            perform = in.nextBoolean();
        }
        while (perform);
    }
}
