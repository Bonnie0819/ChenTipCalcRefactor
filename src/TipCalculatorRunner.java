import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        // Welcoming Statement/Questions for User
        System.out.println("Welcome to TipCalculator!");

        System.out.print("How many people are in your group?: ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the tip percentage? (0-100):");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        //Creating object
        TipCalculator tip = new TipCalculator(numPeople, tipPercentage);

        //Asks for the price of an item
        System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
        double cost = scan.nextDouble();
        scan.nextLine();
        double totalBillBeforeTip = 0;
        totalBillBeforeTip = totalBillBeforeTip + cost;

        //Use of while loop to track prices of items bought by user
        while (cost != -1) {
            System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
            cost = scan.nextDouble();

            if (cost == -1) {
                totalBillBeforeTip = totalBillBeforeTip;
            } else {
                totalBillBeforeTip = totalBillBeforeTip + cost;
            }

        }

    }
}