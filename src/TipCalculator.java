public class TipCalculator {

    //instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip = 0.0;

    //constructor
    public TipCalculator( int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
    }

    //methods
    //getter methods
    //getTotalBillBeforeTip
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    //getTipPercentage
    public int getTipPercentage() {
        return tipPercentage;
    }

    //other methods
    //addMeal
    public void addMeal (double cost) {
        totalBillBeforeTip += cost;
    }
    //tipAmount
    public double tipAmount() {
        return tipPercentage * totalBillBeforeTip;
    }
    //totalBill
    public double totalBill() {
        return tipAmount() * totalBillBeforeTip;
    }
    //perPersonCostBeforeTip
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/numPeople;
    }
    //perPersonTipAmount
    public double perPersonTipAmount() {
        return tipAmount()/numPeople;
    }
    //perPersonTotalCost
    public double perPersonTotalCost () {
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }






}
