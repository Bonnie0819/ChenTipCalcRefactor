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
        TipCalculator calc = new TipCalculator(numPeople, tipPercentage);

        //Asks for the price of an item
        System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
        double cost = scan.nextDouble();
        scan.nextLine();


        //Use of while loop to track prices of items bought by user
        while (cost != -1) {
            calc.addMeal(cost);
            System.out.println("Enter cost in dollars and cents ex: 4.50  (-1 to end):");
            cost = scan.nextDouble();
        }

        //formatting variables
        String formatTotalCost = formatter.format(calc.getTotalBillBeforeTip());
        String formatTotalTip = formatter.format(calc.tipAmount());
        String formatTotalBill = formatter.format(calc.totalBill());
        String formatPersonCostBeforeTip = formatter.format(calc.perPersonCostBeforeTip());
        String formatPersonTipAmount = formatter.format(calc.perPersonTipAmount());
        String formatTotalPersonCost = formatter.format(calc.perPersonTotalCost());

        //Receipt
        System.out.println("___________________________________");
        System.out.println("Total Before Bill: " + formatTotalCost);
        System.out.println("Tip Percentage: " + calc.getTipPercentage());
        System.out.println("Total Tip: " + formatTotalTip);
        System.out.println("Total Bill With Tip: " + formatTotalBill);
        System.out.println("Per Person Cost Before Tip: " + formatPersonCostBeforeTip);
        System.out.println("Tip Per Person: " + formatPersonTipAmount);
        System.out.println("Total Cost Per Person: " + formatTotalPersonCost);

    }
}