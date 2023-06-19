import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gallons = 0;
        double efficiency = 0;
        double price = 0;
        double distance = 0;
        double totalGallons = 0;
        boolean perform = true;

        perform = false;
        do {
            System.out.println("Enter the number of gallons in the tank: ");
            gallons = input.nextDouble();
            System.out.print("Enter the fuel efficiency of the car in MpG: ");
            efficiency = input.nextDouble();
            System.out.println("Enter the price per gallons: ");
            price = input.nextDouble();
            distance = efficiency * gallons;
            totalGallons = 100 / efficiency;
            System.out.println("The cost for every 100 miles is " + totalGallons);
            System.out.println("The total distance your car can go is " + distance + "miles");
            System.out.println("Would you like to run the program again? ");
            perform = input.nextBoolean();
            System.out.println("perform " + perform);
        }
        while (perform);
    }
}
