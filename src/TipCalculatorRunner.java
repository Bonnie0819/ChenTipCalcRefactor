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

    }
}