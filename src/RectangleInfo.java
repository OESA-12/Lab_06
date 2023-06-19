import java.util.Scanner;

import static java.lang.System.in;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        double length = 0;
        double width = 0;
        double perimeter = 0;
        double area = 0;
        double diagonal = 0;
        boolean run = true;

        run = false;
        do {
            System.out.println("Enter the length: ");
            length = input.nextDouble();
            System.out.println("Enter the width: ");
            width = input.nextDouble();
            area = (length * width);
            System.out.println("The area is " + area);
            perimeter = ((length + width) * 2);
            System.out.println("The perimeter is: " + perimeter);
            diagonal = (length * length) + (width * width);
            System.out.println("The diagonal is: " + diagonal);
            System.out.println("Would you like to run the program again? ");
            run = input.nextBoolean();
        }
        while (run);
    }
}
